package com.example.controls.ui.theme.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.smartlab.ui.theme.OnboardHeaderColor

@Composable
fun OnboardHeader(modifier: Modifier = Modifier, text: String) {
    Text(
        text = text,
        modifier = modifier,
        color = OnboardHeaderColor,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
    )
}

@Preview
@Composable
private fun OnboardHeaderPreview() {
    OnboardHeader(text = "Заголовок")
}