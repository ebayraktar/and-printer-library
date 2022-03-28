package com.bayraktar.printerlibrary.common.markers

import com.bayraktar.printerlibrary.common.Builder
import com.bayraktar.printerlibrary.utils.enums.BarcodeType
import com.bayraktar.printerlibrary.utils.enums.FontSize
import com.bayraktar.printerlibrary.utils.enums.HumanReadable

/**
 * Created by Emre Bayraktar on 28.03.2022.
 */
interface IBuilder {
    fun title(text: String, center: Boolean = false): Builder
    fun subtitle(text: String, center: Boolean = false): Builder
    fun text(text: String, fontSize: FontSize, center: Boolean = false): Builder
    fun block(block: String, center: Boolean = false): Builder
    fun qrCode(text: String, size: Int, center: Boolean = true): Builder
    fun barcode(text: String, barcodeType: BarcodeType, humanReadable: HumanReadable): Builder

    fun build(): ByteArray
}