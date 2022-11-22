package apps

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.*



import utils.Auth

@Composable
fun ApplicationScope.auth() {
    var authSuccess by remember { mutableStateOf(false) }
    if (!authSuccess) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Row {
            Box(modifier = Modifier
                .weight(7f)
            ) {

            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                //title
                Text(
                    text = "Авторизация",
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    color = MaterialTheme.colors.primary.copy(alpha = ContentAlpha.high),
                    modifier = Modifier
                        .padding(top = 155.dp, bottom = 10.dp)
                )

                //error box
//            Box(modifier = Modifier
//                .width(275.dp)
//                .height(30.dp)
//                .background(color = Color(1f, .2f, .2f, .4f), shape = RoundedCornerShape(10))
//
//
//
//            ) {
//                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
//                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxSize()) {
//                        Text(
//                            textAlign = TextAlign.Center,
//                            color = Color(1f, .1f, .1f, .8f),
//                            fontWeight = FontWeight.W600,
//                            fontSize = 12.sp,
//                            text = "Неправильный логин или пароль"
//                        )
//                    }
//                }
//            }

                //username
                TextField(
                    value = username,
                    onValueChange = { username = it },
                    label = { Text("Логин") },
                    singleLine = true,
                    shape = RoundedCornerShape(10),
                    modifier = Modifier
                        .padding(bottom = 25.dp, top = 20.dp)

                )

                //password
                TextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Пароль") },
                    singleLine = true,
                    shape = RoundedCornerShape(10),
                    modifier = Modifier,
                    visualTransformation = PasswordVisualTransformation()
                )

                //send button
                Button(
                    onClick = {
                        if (Auth.auth(username, password)) {
                            authSuccess = true
                        } else {
                            username = ""
                            password = ""
                        }
                    },
                    shape = RoundedCornerShape(30),
                    modifier = Modifier
                        .padding(top = 40.dp)
                        .width(150.dp)
                        .height(50.dp)
                ) {
                    Text(
                        text = "Войти",
                        fontWeight = FontWeight.W600,
                        fontSize = 16.sp
                    )
                }


                //new acc
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        ) { append("Нет учетной записи? ") }
                        withStyle(
                            style = SpanStyle(
                                fontSize = 12.sp,
                                color = MaterialTheme.colors.primary,
                                textDecoration = TextDecoration.Underline,
                            )
                        ) { append("Запросить") }
                    },
                    modifier = Modifier
                        .padding(top = 15.dp)
                )
            }
        }
    } else {
        Row {
            // arrow left
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Card(
                    modifier = Modifier.size(62.dp).rotate(180f),
                    shape = CircleShape,
                    elevation = 2.dp
                ) {
                    Image(
                        painter = painterResource("arrow.png"),
                        alignment = Alignment.Center,
                        contentDescription = "arrowLeft",
                        modifier = Modifier
                            .background(MaterialTheme.colors.primary),
                        contentScale = ContentScale.FillBounds
                    )
                }
            }

            //content
            Box(modifier = Modifier
                .weight(12f)
                .fillMaxSize()
            ) {

            }

            // arrow right
            Box(modifier = Modifier
                .weight(1f)
                .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Card(
                    modifier = Modifier.size(62.dp),
                    shape = CircleShape,
                    elevation = 2.dp
                ) {
                    Image(
                        painter = painterResource("arrow.png"),
                        alignment = Alignment.Center,
                        contentDescription = "arrowLeft",
                        modifier = Modifier
                            .background(MaterialTheme.colors.primary),
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
        }
    }
}

