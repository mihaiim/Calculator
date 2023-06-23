package com.mihaiim.calculator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier // Apply stuff on default modifier
            .clip(CircleShape)
            .clickable { onClick() }
            .then(modifier) // and then apply the stuff from modifier from list of parameters
    ) {
        Text(
            text = symbol,
            fontSize = 16.sp,
            color = Color.White
        )
    }
}