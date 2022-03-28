package com.bayraktar.printerlibrary.builders

import com.bayraktar.printerlibrary.common.Builder
import com.bayraktar.printerlibrary.utils.enums.BarcodeType
import com.bayraktar.printerlibrary.utils.enums.FontSize
import com.bayraktar.printerlibrary.utils.enums.HumanReadable

/**
 * Created by Emre Bayraktar on 28.03.2022.
 */
class CPCLBuilder : Builder() {
    override fun title(text: String, center: Boolean): Builder {
        TODO("Not yet implemented")
    }

    override fun subtitle(text: String, center: Boolean): Builder {
        TODO("Not yet implemented")
    }

    override fun text(text: String, fontSize: FontSize, center: Boolean): Builder {
        TODO("Not yet implemented")
    }

    override fun block(block: String, center: Boolean): Builder {
        TODO("Not yet implemented")
    }

    override fun qrCode(text: String, size: Int, center: Boolean): Builder {
        TODO("Not yet implemented")
    }

    override fun barcode(
        text: String,
        barcodeType: BarcodeType,
        humanReadable: HumanReadable
    ): Builder {
        TODO("Not yet implemented")
    }

    override fun build(): ByteArray {
        TODO("Not yet implemented")
    }
}