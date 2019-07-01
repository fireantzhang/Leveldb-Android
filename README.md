Level-Android
=============

### 说明
这个项目来源于：[Level-Android](https://github.com/googolmo/Leveldb-Android)，由于这个项目已经好久没有维护，并且不支持输出 64 位的 SO 包，所以重新对项目做了调整，使其能够正常出包，以及支持 64 位出包。

### 使用方式

1. 直接引用 aar：[leveldb-release.aar](https://raw.githubusercontent.com/fireantzhang/Leveldb-Android/master/leveldb-release.aar)，包含：java 接口代码、各个 ABI 的 SO 包(armeabi-v7a、arm64-v8a、x86、x86_64)

2. 引用单一 SO 包
   - [armeabi-v7a](https://raw.githubusercontent.com/fireantzhang/Leveldb-Android/master/leveldb/libs/armeabi-v7a/libleveldbjni.so)
   - [arm64-v8a](https://raw.githubusercontent.com/fireantzhang/Leveldb-Android/master/leveldb/libs/arm64-v8a/libleveldbjni.so)
   - [x86](https://raw.githubusercontent.com/fireantzhang/Leveldb-Android/master/leveldb/libs/x86/libleveldbjni.so)
   - [x86_64](https://raw.githubusercontent.com/fireantzhang/Leveldb-Android/master/leveldb/libs/x86_64/libleveldbjni.so)
   
   
### 编译 SO 包
1. 确保本机环境有配置 ndk-build 环境，运行 `ndk-build --version` 可以查看本机的 ndk 版本信息，并验证 `ndk-build` 环境可以正常运行；
2. `jni` 的代码路径是：`./leveldb/src/main/jni/`，运行下面命令可以编译 SO 包：
    ```shell
    ndk-build -B -C ./leveldb/src/main/jni/ 
    ``` 

