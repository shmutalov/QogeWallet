# patch react-native-tor
$p1 = "../node_modules/react-native-tor/android/gradle.properties"
$p1c = Get-Content $p1
$p1c.replace('1.3.50', '1.6.0') | Set-Content $p1

# patch rn-lnd
$p2 = "../node_modules/react-native-camera-kit/android/src/main/java/com/rncamerakit/CKCamera.kt"
$p2c = Get-Content $p2
$p2c.replace('1.3.50', '1.6.0') | Set-Content $p2

# patch react-native-camera-kit
$p3 = "../node_modules/react-native-camera-kit/android/src/main/java/com/rncamerakit/CKCamera.kt"
$p3c = Get-Content $p3
$p3c = $p3c.replace('detector: ScaleGestureDetector?', 'detector: ScaleGestureDetector') 
$p3c.replace('detector?.scaleFactor ?: return true', 'detector.scaleFactor') | Set-Content $p3
