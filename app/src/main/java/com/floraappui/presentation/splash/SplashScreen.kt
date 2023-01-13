package com.floraappui.presentation.splash

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.floraappui.R
import com.floraappui.ui.theme.ColorPrimary
import com.floraappui.ui.theme.ColorPrimaryWhite
import com.floraappui.ui.theme.White

@Composable
fun SplashScreen(navController: NavController) {
    val scale = remember {
        Animatable(initialValue = 0f)
    }
    val overShootInterpolator = remember {
        OvershootInterpolator(2f)
    }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.5f,
            animationSpec = tween(
                durationMillis = 500,
                easing = {
                    overShootInterpolator.getInterpolation(it)
                }
            )
        )

        /*delay(Constants.SPLASH_SCREEN_DURATION)
        navController.popBackStack()
        navController.navigate(ScreenRoutes.LoginScreen.route)*/
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSplash() {
    Surface(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.ic_splash_background),
            contentDescription = "Splash bg",
            contentScale = ContentScale.FillWidth
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_splash_logo),
                contentDescription = "Logo",
                contentScale = ContentScale.Crop
            )
        }

    }
}