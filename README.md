# android-dialog-dsl-sample

## Usage

``` Kotlin
showDialog {
    title = "title"
    message = "message"
    rightClicks {
        // do something ...
    }
}
```

* 设置Dialog的`cancelable`属性

``` Kotlin
showDialog {
    cancelOutside = false

    ...
}
```

* 设置按钮

``` Kotlin
showDialog {
    ...

    rightClicks(key = "Yes") {
        // do something ...
    }
}
```

* 显示两个按钮

``` Kotlin
showDialog {
    title = "title"
    message = "message"
    leftClicks("No", false) { // 按钮文案为“No”，点击后不会关闭Dialog
        // do something ...
    }
    rightClicks {
        // do something ...
    }
}
```