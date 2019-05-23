package com.centosquare.Fragments


import android.app.DownloadManager
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.*
import android.view.textclassifier.TextLinks
import android.widget.Adapter
import android.widget.EditText
import android.widget.ImageView
import com.centosquare.Adapters.FindMasjidAdapter
import com.centosquare.ModelClasses.Masjid
import com.centosquare.NavigationDrawerActivity

import com.centosquare.R
import com.google.gson.GsonBuilder
import okhttp3.*
import java.io.IOException
import java.util.ArrayList


class HomeFragment : Fragment() {


    var homeView: View? = null
    var humbburger: ImageView? = null
    var search_masjid: EditText? = null
    var mDrawerLayout: DrawerLayout? = null
    var masajidNames = ArrayList<String>()
    var recyclerView: RecyclerView? = null
    var adapter: Adapter? = null





    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        homeView = inflater.inflate(R.layout.fragment_home, container, false)

        //<For Toolbar>
        val toolbar = activity!!.findViewById(R.id.toolbar) as android.support.v7.widget.Toolbar
        toolbar.visibility = View.GONE
        //</For Toolbar


        //calling the method to set recycler view
        RecyclerViewMasajid()

        recyclerView    = homeView?.findViewById(R.id.RV_masajidList) as RecyclerView
        search_masjid   = homeView?.findViewById<EditText>(R.id.edit_txt_masjid)
        humbburger      = homeView?.findViewById(R.id.humburgerIcon)
        mDrawerLayout   = activity!!.findViewById(R.id.drawer_layout) as DrawerLayout


        humbburger?.setOnClickListener(View.OnClickListener {
            mDrawerLayout?.openDrawer(Gravity.RIGHT)

        })

        fetchJSON()

        return  homeView
    }

    private fun fetchJSON() {

        val url = "http://masjidi.co.uk/api/getMosquesList/33"
        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()
        client.newCall(request)

        client.newCall(request).enqueue(object: Callback
        {
            override fun onFailure(call: Call, e: IOException) {
                println("Failed on execute request")
            }

            override fun onResponse(call: Call, response: Response) {
                val body = response.body()?.string()
                println(body)

                val gson = GsonBuilder().create()
                val masjid = gson.fromJson(body, Masjid::class.java)

            }

        })

    }

    //this method will add masjid names to the list and set recycler adapter
    fun RecyclerViewMasajid() {
        masajidNames.add("Masjid-e-Nagina")
        masajidNames.add("Masjid-e-Aqsa")
        masajidNames.add("Masjid-e-Iqra")
        masajidNames.add("Masjid-e-Tooba")
        masajidNames.add("Masjid-e-Ayesha")
        masajidNames.add("Masjid-e-Nabvi")

        val recyclerView = homeView?.findViewById(R.id.RV_masajidList) as RecyclerView
        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        val adapter = FindMasjidAdapter(masajidNames, activity as NavigationDrawerActivity)
        recyclerView.adapter = adapter
    }
}

