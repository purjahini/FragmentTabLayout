package com.bedev.fragment

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class PagesAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val frages = listOf(
        FragmentSatu(),
        FragmentDua(),
        fragmentTiga(),
        FragmentEmpat()
    )

    override fun getItem(posisi: Int): Fragment? {

        return frages [posisi]
    }

    override fun getCount(): Int {
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return frages.size
    }

    override fun getPageTitle(posisi: Int): CharSequence? {
        // return super.getPageTitle(position)
        return when (posisi) {
            0 -> "Profl"
            1 -> "Pesan"
            2 -> "Extra"
            else -> "Daftar"
        }
    }
}