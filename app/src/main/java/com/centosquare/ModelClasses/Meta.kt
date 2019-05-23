package com.centosquare.ModelClasses

class Meta
{
    private var current_page: Int = 0
    private var from: Int = 0
    private var last_page: Int = 0
    private var per_page: Int = 0
    private var to: Int = 0
    private var total: Int = 0
    private var path: String? = null

    fun getCurrent_page(): Int {
        return current_page
    }

    fun setCurrent_page(current_page: Int) {
        this.current_page = current_page
    }

    fun getFrom(): Int {
        return from
    }

    fun setFrom(from: Int) {
        this.from = from
    }

    fun getLast_page(): Int {
        return last_page
    }

    fun setLast_page(last_page: Int) {
        this.last_page = last_page
    }

    fun getPer_page(): Int {
        return per_page
    }

    fun setPer_page(per_page: Int) {
        this.per_page = per_page
    }

    fun getTo(): Int {
        return to
    }

    fun setTo(to: Int) {
        this.to = to
    }

    fun getTotal(): Int {
        return total
    }

    fun setTotal(total: Int) {
        this.total = total
    }

    fun getPath(): String? {
        return path
    }

    fun setPath(path: String) {
        this.path = path
    }
}