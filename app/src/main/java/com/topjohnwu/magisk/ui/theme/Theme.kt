package com.topjohnwu.magisk.ui.theme

import com.topjohnwu.magisk.R
import com.topjohnwu.magisk.core.Config

enum class Theme(
        val themeName: String,
        val themeRes: Int
) {

    Dynamic(
            themeName = "Dynamic",
            themeRes = R.style.ThemeFoundationMD2_Dynamic
    ),
    Piplup(
            themeName = "Piplup",
            themeRes = R.style.ThemeFoundationMD2_Piplup
    ),
    Rayquaza(
            themeName = "Rayquaza",
            themeRes = R.style.ThemeFoundationMD2_Rayquaza
    ),
    Zapdos(
            themeName = "Zapdos",
            themeRes = R.style.ThemeFoundationMD2_Zapdos
    ),
    Charmeleon(
            themeName = "Charmeleon",
            themeRes = R.style.ThemeFoundationMD2_Charmeleon
    ),
    Mew(
            themeName = "Mew",
            themeRes = R.style.ThemeFoundationMD2_Mew
    ),
    Salamence(
            themeName = "Salamence",
            themeRes = R.style.ThemeFoundationMD2_Salamence
    ),
    Fraxure(
            themeName = "Fraxure",
            themeRes = R.style.ThemeFoundationMD2_Fraxure
    );

    val isSelected get() = Config.themeOrdinal == ordinal

    fun select() {
        Config.themeOrdinal = ordinal
    }

    companion object {
        val selected get() = values().getOrNull(Config.themeOrdinal) ?: Piplup
    }

}