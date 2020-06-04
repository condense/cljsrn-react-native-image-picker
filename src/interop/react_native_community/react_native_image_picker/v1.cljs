(ns interop.react-native-community.react-native-image-picker.v1
  (:require [react-native-image-picker :as module]))

(assert module)
(assert module/default)

; https://github.com/react-native-community/react-native-image-picker/blob/master/src/index.ts

(defn massage-response [resp] (js->clj resp :keywordize-keys true))

(defn launch-camera [opts cb] (module/default.launchCamera (clj->js opts) (comp cb massage-response)))
(defn launch-image-library [opts cb] (module/default.launchImageLibrary (clj->js opts) (comp cb massage-response)))
(defn show-image-picker [opts cb] (module/default.showImagePicker (clj->js opts) (comp cb massage-response)))
