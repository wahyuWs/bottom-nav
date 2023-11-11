package com.tutorial.bottomnavigationjc

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomItem(
    val name: String,
    val route: String,
    val icon: ImageVector,
    val badgeIcon: Int = 0
)
