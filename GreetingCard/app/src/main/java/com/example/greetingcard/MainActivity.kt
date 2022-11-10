package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingcard.ui.theme.GreetingCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //다른 함수 호출 -> 사용자 인터페이스 빌드
        //andorid에서의 onCreate() == kotlin의 main()
        super.onCreate(savedInstanceState)
        //구성 가능한 함수 -> 레이아웃 정의하는데 사용
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

//@Composable 주석으로 표시한 모든 함수 : setContent() 함수 or 다른 구성 가능한 함수에서 호출 가능
@Composable //@composable 얘가 주석임 ->아무것도 반환 못함
// Greeting함수 : 구성가능한 함수 - 몇 가지 입력받아 화면에 표시되는 내용 생성
fun Greeting(name: String)
{
    Text(text = "Hi, my name is $name!")
}

//미리보기함수가 되기 위해 추가한 주석
//showBackground가 true로 설정 시, 앱 미리보기에 배경 추가됨
@Preview(showBackground = true)
@Composable
//전체 앱을 빌드 x -> 앱이 어떻게 표시되는지 확인 가능
fun DefaultPreview() {
    GreetingCardTheme {
        Greeting("Meghan")
    }
}