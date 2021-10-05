package com.axell.navigtionsample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.axell.navigtionsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onNewIntent(intent: Intent?) {
        Log.d("onNewIntent", "before super intent: ${intent.toString()}")
        intent?.removeFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        Log.d("onNewIntent", "after flag removed intent: ${intent.toString()}")
        super.onNewIntent(intent)

/*        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment
        navHostFragment.navController.handleDeepLink(intent)*/
        Log.d("onNewIntent", "intent: ${intent.toString()}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}