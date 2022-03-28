package com.bayraktar.printerlibrary

import com.bayraktar.printerlibrary.builders.CPCLBuilder
import com.bayraktar.printerlibrary.builders.EPLBuilder
import com.bayraktar.printerlibrary.builders.ESCBuilder
import com.bayraktar.printerlibrary.builders.TSPLBuilder
import com.bayraktar.printerlibrary.common.Builder
import com.bayraktar.printerlibrary.common.markers.IBuilder
import com.bayraktar.printerlibrary.utils.enums.BarcodeType
import com.bayraktar.printerlibrary.utils.enums.FontSize
import com.bayraktar.printerlibrary.utils.enums.HumanReadable
import com.bayraktar.printerlibrary.utils.enums.PrinterLanguageType

/**
 * Created by Emre Bayraktar on 28.03.2022.
 */
class BuilderManager(printerLanguageType: PrinterLanguageType) : IBuilder {
    private val builder: Builder = when (printerLanguageType) {
        PrinterLanguageType.ESC -> ESCBuilder()
        PrinterLanguageType.TSPL -> TSPLBuilder()
        PrinterLanguageType.CPCL -> CPCLBuilder()
        PrinterLanguageType.EPL -> EPLBuilder()
    }

    /**
     * To be Added
     */
    override fun title(text: String, center: Boolean): Builder {
        return builder.title(text, center)
    }

    /**
     * To be Added
     */
    override fun subtitle(text: String, center: Boolean): Builder {
        return builder.subtitle(text, center)
    }

    /**
     * To be Added
     */
    override fun text(text: String, fontSize: FontSize, center: Boolean): Builder {
        return builder.text(text, fontSize, center)
    }

    /**
     * To be Added
     */
    override fun block(block: String, center: Boolean): Builder {
        return builder.block(block, center)
    }

    /**
     * To be Added
     */
    override fun qrCode(text: String, size: Int, center: Boolean): Builder {
        return builder.qrCode(text, size, center)
    }

    /**
     * To be Added
     */
    override fun barcode(
        text: String,
        barcodeType: BarcodeType,
        humanReadable: HumanReadable
    ): Builder {
        return builder.barcode(text, barcodeType, humanReadable)
    }

    /**
     * To be Added
     */
    override fun build(): ByteArray {
        return builder.build()
    }
}