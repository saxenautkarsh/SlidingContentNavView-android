# SlidingContentNavView-android
Easy to use Custom DrawerLayout, that slides and resizes the whole screen content when navigation view is pulled out.

Following are the steps to use this library

1. Add this "maven{url 'https://jitpack.io'}" to the repositories section of allprojects section in project level build.gradle.</br>
2. Add dependency "com.github.saxenautkarsh:SlidingContentNavView-android:0.1.0" to dependencies in app level build.gradle</br>
(Or just follow the instructions given here [![](https://jitpack.io/v/saxenautkarsh/SlidingContentNavView-android.svg)](https://jitpack.io/#saxenautkarsh/SlidingContentNavView-android/0.1.0) for step 1 and step 2) </br>

3. Now instead of using DrawerLayout use ContentSlidingDrawerLayout in the xml.</br>
4. After inflating this layout in onCreate method, call <b> method contentSlidingDrawerLayout.init(activity,navigationView,actionBar)</b>. If action bar is not used then you can use <b> method contentSlidingDrawerLayout.init(activity,navigationView) </b>.
6. Add onOptionsItemSelected listner for opening Navigation View by clicking on Hamburger icon.
7. Your Activity code will look something like show below 
<a href="https://ibb.co/kQ3qdd"><img src="https://preview.ibb.co/e7ydWy/Screenshot_from_2018_07_16_21_00_27.jpg" alt="Screenshot_from_2018_07_16_21_00_27" border="0"></a>

5. That's all you are done.

![Alt Text](https://media.giphy.com/media/ddUY8ubyc2ijbbovtd/giphy.gif)

