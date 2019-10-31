package br.com.andre.desafiotimer

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainPagerAdapter (fm: FragmentManager) :
    FragmentPagerAdapter (fm) {

    private val fragmentList: ArrayList<Fragment> = arrayListOf<Fragment>()
    private val titleList: ArrayList<String> = arrayListOf<String>()

    init {
        titleList.add("Timer")
        titleList.add("StopWatch")
        titleList.add("Alarm")
        titleList.add("Clock")
        fragmentList.add(TimerFragment())
        fragmentList.add(StopWatchFragment())
        fragmentList.add(AlarmFragment())
        fragmentList.add(ClockFragment())
    }

    override fun getCount(): Int = fragmentList.size

    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getPageTitle(position: Int): CharSequence? = titleList[position]


}