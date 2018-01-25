package com.unistrong.luowei.demo

import android.Manifest
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.SeekBar
import com.luowei.slide.SlideAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    private lateinit var advertisement: Advertisement

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE), 0)
        (findViewById<SeekBar>(R.id.roteSeekBar)).setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
//                advertisement.setProgress(progress)
//                slide_advertisement.nextBitmap = BitmapFactory.decodeFile("/sdcard/adv2.png")
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })

//        circleIndicator.updateIndicator(20)
//        circleIndicator.onPageSelected(3)
//        var index = 0
//        button.setOnClickListener { circleIndicator.onPageSelected(index++ % 20) }

        /* advertisement.setFragmentManager(supportFragmentManager)
         advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Image, "/sdcard/adv1.png"))
         advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Image, "/sdcard/adv2.png"))
         advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Image, "/sdcard/adv3.png"))
         advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Video, "/sdcard/1.mp4"))*/
//        advertisement.nextBitmap=  BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher)
//        advertisement.currentBitmap = BitmapFactory.decodeResource(resources, R.mipmap.maxresdefault)

//        advertisement.ImageViewA.currentBitmap = BitmapFactory.decodeResource(resources, R.mipmap.fdae)
//        advertisement.ImageViewA.nextBitmap = BitmapFactory.decodeResource(resources, R.mipmap.maxresdefault)
//        advertisement.ImageViewB.currentBitmap = BitmapFactory.decodeResource(resources, R.mipmap.maxresdefault)
//        advertisement.ImageViewB.nextBitmap = BitmapFactory.decodeResource(resources, R.mipmap.fdae)
//        advertisement.ImageViewC.currentBitmap = BitmapFactory.decodeResource(resources, R.mipmap.ddff)
//        advertisement.ImageViewC.nextBitmap = BitmapFactory.decodeResource(resources, R.mipmap.maxresdefault)
//        advertisement.currentBitmap = BitmapFactory.decodeFile("/sdcard/adv1.png")
        var count = 0
        button.setOnClickListener {
            //            advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Video, "/sdcard/ad/1.mp4"))
            advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Image, "/sdcard/2h/1.jpg"))
//            advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Video, "/sdcard/1.mp4"))


        }

//        (1..1042).map { "$it.jpg" }.forEach { advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Image, "/sdcard/img18/$it")) }
//        (1..2).map { "$it.jpg" }.forEach { advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Image, "/sdcard/2h/$it")) }

//        advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Image, "/sdcard/ad/adv2.png"))
//        advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Image, "/sdcard/ad/adv3.png"))
//        advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Image, "/sdcard/2h/1.jpg"))
        advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Image, "/sdcard/2h/2.jpg"))
        advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Video, "/sdcard/1.mp4"))
        advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Image, "/sdcard/2h/3.jpg"))
        advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Video, "/sdcard/2.mp4"))

//        advertisement.addItem(SlideAdapter.Item(SlideAdapter.ItemType.Video, "/sdcard/2.mp4"))
    }
}
