
## Manual setup

### Permissions 

> You will also need to add UsageDescription on iOS and some permissions on Android, refer to the Install doc.

https://github.com/react-native-community/react-native-image-picker/blob/master/docs/Install.md#post-install-steps

### :language-out

Set `{:language-out :es6}` so `default` isn't treated as a reserved word.  Without this CLJS produces JS which includes a mangled name.
