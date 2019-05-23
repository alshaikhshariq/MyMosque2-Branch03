package com.centosquare.ModelClasses

class Masjid
{
    private var ID: Int = 0
    private var name: String? = null
    private var longtitude: String? = null
    private var latitude: String? = null
    private var image_name: String? = null
    private var image_path: String? = null
    private var forvoriate_id: Int = 0
    private var forvoriate: Int = 0
    private val links: Links? = null
    private val meta: Meta? = null

    constructor(ID: Int, name: String?, longtitude: String?, latitude: String?, image_name: String?, image_path: String?, forvoriate_id: Int, forvoriate: Int)
    {
        this.ID = ID
        this.name = name
        this.longtitude = longtitude
        this.latitude = latitude
        this.image_name = image_name
        this.image_path = image_path
        this.forvoriate_id = forvoriate_id
        this.forvoriate = forvoriate
    }


    override fun toString(): String {
        return "Masjid(ID=$ID, name=$name, longtitude=$longtitude, latitude=$latitude, image_name=$image_name, image_path=$image_path, forvoriate_id=$forvoriate_id, forvoriate=$forvoriate, links=$links, meta=$meta)"
    }

    fun getID(): Int {
        return ID
    }

    fun setID(ID: Int) {
        this.ID = ID
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getLongtitude(): String? {
        return longtitude
    }

    fun setLongtitude(longtitude: String) {
        this.longtitude = longtitude
    }

    fun getLatitude(): String? {
        return latitude
    }

    fun setLatitude(latitude: String) {
        this.latitude = latitude
    }

    fun getImage_name(): String? {
        return image_name
    }

    fun setImage_name(image_name: String) {
        this.image_name = image_name
    }

    fun getImage_path(): String? {
        return image_path
    }

    fun setImage_path(image_path: String) {
        this.image_path = image_path
    }

    fun getForvoriate_id(): Int {
        return forvoriate_id
    }

    fun setForvoriate_id(forvoriate_id: Int) {
        this.forvoriate_id = forvoriate_id
    }

    fun getForvoriate(): Int {
        return forvoriate
    }

    fun setForvoriate(forvoriate: Int) {
        this.forvoriate = forvoriate
    }


}

