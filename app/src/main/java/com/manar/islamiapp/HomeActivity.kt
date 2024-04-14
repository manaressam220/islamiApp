package com.manar.islamiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.manar.islamiapp.databinding.ActivityHomeActivtyBinding
import com.manar.islamiapp.fragment.HadethFragment
import com.manar.islamiapp.fragment.QuraanFragment
import com.manar.islamiapp.fragment.RadioFragment
import com.manar.islamiapp.fragment.TasbehFragment

class HomeActivity : AppCompatActivity() {
 private lateinit var binding: ActivityHomeActivtyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeActivtyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.islamiBottomNavigation.setOnItemSelectedListener {
            if (it.itemId == R.id.navigation_quraan){
                pushFragment(QuraanFragment())

            }
           else if (it.itemId == R.id.navigation_hadeth){
                 pushFragment(HadethFragment())
            }
          else  if (it.itemId == R.id.navigation_sebha){
              pushFragment(TasbehFragment())
            }
           else if (it.itemId == R.id.navigation_radio){
                    pushFragment(RadioFragment())
            }
            return@setOnItemSelectedListener true
        }
        binding.islamiBottomNavigation.selectedItemId=R.id.navigation_quraan
    }
    private fun pushFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(binding.islamiAppFragment.id,fragment).commit()
    }
}