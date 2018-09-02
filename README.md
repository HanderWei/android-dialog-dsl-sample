# android-dialog-dsl-sample

## 为什么要使用DSL封装?

* 简洁
* 可读性强
* 统一管理应用内Dialog样式

## 涉及到哪些Kotlin语言特性？

* 扩展函数
* 默认参数
* 函数式编程
* Function literal with receiver

## 如何使用？

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

> sample只是举例如何实现DSL，封装请依据具体项目