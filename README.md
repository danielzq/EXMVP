# EXMVP

[![](https://jitpack.io/v/danielzq/EXMVP.svg)](https://jitpack.io/#danielzq/EXMVP) [ ![Download](https://api.bintray.com/packages/zq26zhangqi/MVP/EXMVP/images/download.svg) ](https://bintray.com/zq26zhangqi/MVP/EXMVP/_latestVersion)

## Download
1. Add to root build.gradle:
```
    allprojects {
        repositories {
        ...
            maven { url 'https://jitpack.io' }
        }
    }
```

2. Configure this dependency to your app build.gradle:

```
    implementation 'com.github.danielzq:EXMVP:1.0.1'
```

## How to use
1. Make your BaseActivity extends EXMVPBaseAppCompatActivity
2. Override attachBaseContext, and add getPresenter method
```
           @Override
           protected void attachBaseContext(Context newBase) {
               super.attachBaseContext(newBase);
               getPresenter();
           }
```
3. Implement your BasePresenter extends EXMVPBasePresenter and define the BaseView extends EXMVPView
```
public class EXBasePresenter<V extends EXBasePresenter.BaseView> extends EXMVPBasePresenter<V> {
    public interface BaseView extends EXMVPView {
            void showProgress();
            void hideProgress();
    }
}
```
4. More details you can refer to example module.


License
-------

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
[![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg)](https://github.com/996icu/996.ICU/blob/master/LICENSE)


