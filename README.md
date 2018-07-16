# SlidingContentNavView-android
Easy to use Custom DrawerLayout, that slides and resizes the whole screen content when navigation view is pulled out.

Following are the steps to use this library

1. Add this "maven url 'https://jitpack.io'" to the repositories section of project level build.gradle.</br>
2. Add dependency "com.github.saxenautkarsh:SlidingContentNavView-android:0.1.0" to dependencies in app level build.gradle</br>
(Or just follow the instructions given here https://jitpack.io/#saxenautkarsh/SlidingContentNavView-android) </br>

3. Now instead of using DrawerLayout use ContentSlidingDrawerLayout in the xml.</br>
4. After inflating this layout in onCreate method, call <b> method contentSlidingDrawerLayout.init(activity,navigationView,actionBar)</b>. If action bar is not used then you can use <b> method contentSlidingDrawerLayout.init(activity,navigationView) </b>.
5. That's all you are done.

![Alt Text](https://media.giphy.com/media/ddUY8ubyc2ijbbovtd/giphy.gif)

