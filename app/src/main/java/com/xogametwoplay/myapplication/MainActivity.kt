package com.xogametwoplay.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xogametwoplay.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var who_step = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageXOView2.setOnClickListener {
            if (who_step==1) binding.imageXOView2.setImageResource(R.drawable.x_and_o_x)
            if (who_step==2) binding.imageXOView2.setImageResource(R.drawable.x_and_o_o)
            set_who_step()
        }
        binding.imageXOView3.setOnClickListener {
            if (who_step==1) binding.imageXOView3.setImageResource(R.drawable.x_and_o_x)
            if (who_step==2) binding.imageXOView3.setImageResource(R.drawable.x_and_o_o)
            set_who_step()
        }
        binding.imageXOView4.setOnClickListener {
            if (who_step==1) binding.imageXOView4.setImageResource(R.drawable.x_and_o_x)
            if (who_step==2) binding.imageXOView4.setImageResource(R.drawable.x_and_o_o)
            set_who_step()
        }
        binding.imageXOView5.setOnClickListener {
            if (who_step==1) binding.imageXOView5.setImageResource(R.drawable.x_and_o_x)
            if (who_step==2) binding.imageXOView5.setImageResource(R.drawable.x_and_o_o)
            set_who_step()
        }
        binding.imageXOView6.setOnClickListener {
            if (who_step==1) binding.imageXOView6.setImageResource(R.drawable.x_and_o_x)
            if (who_step==2) binding.imageXOView6.setImageResource(R.drawable.x_and_o_o)
            set_who_step()
        }
        binding.imageXOView7.setOnClickListener {
            if (who_step==1) binding.imageXOView7.setImageResource(R.drawable.x_and_o_x)
            if (who_step==2) binding.imageXOView7.setImageResource(R.drawable.x_and_o_o)
            set_who_step()
        }
        binding.imageXOView8.setOnClickListener {
            if (who_step==1) binding.imageXOView8.setImageResource(R.drawable.x_and_o_x)
            if (who_step==2) binding.imageXOView8.setImageResource(R.drawable.x_and_o_o)
            set_who_step()
        }
        binding.imageXOView9.setOnClickListener {
            if (who_step==1) binding.imageXOView9.setImageResource(R.drawable.x_and_o_x)
            if (who_step==2) binding.imageXOView9.setImageResource(R.drawable.x_and_o_o)
            set_who_step()
        }
        binding.imageXOView10.setOnClickListener {
            if (who_step==1) binding.imageXOView10.setImageResource(R.drawable.x_and_o_x)
            if (who_step==2) binding.imageXOView10.setImageResource(R.drawable.x_and_o_o)
            set_who_step()
        }
    }
    fun set_who_step(){
        if (who_step==1) who_step = 2
        else who_step=1
    }

}