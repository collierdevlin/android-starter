package com.collierdevlinmedia.renameme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.collierdevlinmedia.renameme.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buildLogo()
        setupTimer()
    }

    private fun buildLogo() {
        binding.logo.setImageResource(R.drawable.ic_launcher_foreground)
        binding.logo.alpha = 0f
        binding.logo.animate().setDuration(1000).alpha(1f)
    }

    private fun setupTimer() {
        binding.root.alpha = 0f
        binding.root.animate().setDuration(1000).alpha(1f).withEndAction {
            val i = Intent(this, MainActivity::class.java)
            i.putExtras(intent)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}