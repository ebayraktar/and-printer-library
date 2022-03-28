package com.bayraktar.printerlibrary.utils.enums

/**
 * Created by Emre Bayraktar on 28.03.2022.
 */
enum class Measurement {
    Default,
    Inch,
    Mm,
    Dot,
}

enum class Alignment {
    Default,
    Left,
    Center,
    Right,
}

enum class FontSize(value: Int) {
    Body(1),
    Medium(2),
    Title(3),
}

enum class Rotation(value: Int) {
    NoRotation(0),
    Degrees90(90),
    Degrees180(180),
    Degrees270(270),
}

enum class HumanReadable(value: Int) {
    NotReadable(0),
    AlignsToLeft(1),
    AlignsToCenter(2),
    AlignsToRight(3),
}

enum class ECCLevel(value: Int) {
    L(7),
    M(15),
    Q(25),
    H(30),
}

enum class BarcodeType(value: Int) {
    Code128(128)
}

enum class PrinterConnectionType {
    Bluetooth,
    Network,
    Usb,
}

enum class PrinterLanguageType {
    ESC,
    TSPL,
    CPCL,
    EPL,
}


