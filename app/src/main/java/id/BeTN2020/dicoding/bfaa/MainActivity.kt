package id.BeTN2020.dicoding.bfaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import id.BeTN2020.dicoding.bfaa.ui.searchusers.SearchUsersFragment
import id.BeTN2020.dicoding.bfaa.ui.splashscreen.SplashScreenFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(R.id.fl_activity_main, SplashScreenFragment())

        //Three Second splash time
        Handler().postDelayed({
            //start SearchUsersFragment
            replaceFragment(R.id.fl_activity_main, SearchUsersFragment())
        }, 3000)
    }

    private fun replaceFragment(layout: Int, fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(layout, fragment)
            .commitAllowingStateLoss()

    }

    fun noReplaceFragment(layout: Int, fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .add(layout, fragment)
            .commitAllowingStateLoss()

    }

    fun noReplaceBackFragment(layout: Int, fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .add(layout, fragment)
            .addToBackStack(null)
            .commitAllowingStateLoss()

    }

    fun replaceBackFragment(layout: Int, fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(layout, fragment)
            .addToBackStack(null)
            .commitAllowingStateLoss()

    }

}