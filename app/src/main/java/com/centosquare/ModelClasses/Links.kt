package com.centosquare.ModelClasses

class Links
{
    private var first: String? = null
    private var last: String? = null
    private var prev: String? = null
    private var next: String? = null

    fun getFirst(): String? {
        return first
    }

    fun setFirst(first: String) {
        this.first = first
    }

    fun getLast(): String? {
        return last
    }

    fun setLast(last: String) {
        this.last = last
    }

    fun getPrev(): String? {
        return prev
    }

    fun setPrev(prev: String) {
        this.prev = prev
    }

    fun getNext(): String? {
        return next
    }

    fun setNext(next: String) {
        this.next = next
    }
}