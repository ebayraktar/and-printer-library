package com.bayraktar.printerlibrary.common.markers

/**
 * Created by Emre Bayraktar on 28.03.2022.
 */
interface IConfiguration {
    /**
     * To be Added
     */
    fun clearBuffer(): IConfiguration

    /**
     * To be Added
     */
    fun setBackFeed(length: Int): IConfiguration

    /**
     * To be Added
     */
    fun setDensity(darkness: Int): IConfiguration

    /**
     * To be Added
     */
    fun setDirection(xMirror: Boolean = true, yMirror: Boolean = false): IConfiguration

    /**
     * To be Added
     */
    fun setFeed(length: Int): IConfiguration

    /**
     * To be Added
     */
    fun setGap(m: Int, n: Int): IConfiguration

    /**
     * To be Added
     */
    fun setPrintCopy(count: Int): IConfiguration

    /**
     * To be Added
     */
    fun setSize(width: Double, height: Double): IConfiguration

    /**
     * To be Added
     */
    fun setTitleSize(size: Int): IConfiguration

    /**
     * To be Added
     */
    fun setSubtitleSize(size: Int): IConfiguration

    /**
     * To be Added
     */
    fun setTextSize(size: Int): IConfiguration
}