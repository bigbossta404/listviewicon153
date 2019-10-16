package com.example.listviewicon_153.model

import com.example.listviewicon_153.R

object ngodinglist {
    private val namakoding = arrayOf(
        "HTML",
        "C++",
        "Kotlin",
        "Java",
        "Javascript"
    )

    private val detailkoding = arrayOf(
        "Bahasa pemprograman web",
        "Bahasa basic mesin",
        "Bahasa pemprograman android",
        "Bahasa pemprograman desktop",
        "Bahasa pemprograman tools web"
    )

    private val logokoding = intArrayOf(
        R.drawable.html,
        R.drawable.cplus,
        R.drawable.kotin,
        R.drawable.java,
        R.drawable.javascript
    )

    val listKoding: ArrayList<koding>
        get() {
            val list = arrayListOf<koding>()
            for (position in namakoding.indices) {
                val kod = koding()
                kod.nama = namakoding[position]
                kod.detail = detailkoding[position]
                kod.logo = logokoding[position]
                list.add(kod)
            }
            return list
        }
}