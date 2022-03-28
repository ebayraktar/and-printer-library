package com.bayraktar.printerlibrary.configurations

import com.bayraktar.printerlibrary.common.Configuration
import com.bayraktar.printerlibrary.common.markers.IConfiguration

/**
 * Created by Emre Bayraktar on 28.03.2022.
 */
internal class BluetoothConfiguration : Configuration() {
    override fun clearBuffer(): IConfiguration {
        TODO("Not yet implemented")
    }

    override fun setBackFeed(length: Int): IConfiguration {
        TODO("Not yet implemented")
    }

    override fun setDensity(darkness: Int): IConfiguration {
        TODO("Not yet implemented")
    }

    override fun setDirection(xMirror: Boolean, yMirror: Boolean): IConfiguration {
        TODO("Not yet implemented")
    }

    override fun setFeed(length: Int): IConfiguration {
        TODO("Not yet implemented")
    }

    override fun setGap(m: Int, n: Int): IConfiguration {
        TODO("Not yet implemented")
    }

    override fun setPrintCopy(count: Int): IConfiguration {
        TODO("Not yet implemented")
    }

    override fun setSize(width: Double, height: Double): IConfiguration {
        TODO("Not yet implemented")
    }

    override fun setTitleSize(size: Int): IConfiguration {
        TODO("Not yet implemented")
    }

    override fun setSubtitleSize(size: Int): IConfiguration {
        TODO("Not yet implemented")
    }

    override fun setTextSize(size: Int): IConfiguration {
        TODO("Not yet implemented")
    }
}