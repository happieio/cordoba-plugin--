module.exports = {
    *******Web_interface_name*******: function (userIdentifier, apiKey) {
        var defaults = {user: userIdentifier, api: apiKey};
        cordova.exec(*******successCallback*******, *******failureCallBack*******, "*******plugin name registered in native class*******", "******* function name or parsed string*******", [defaults]);
    },

    *******another_Web_interface_name*******: function () {
        var defaults = {};
        cordova.exec(*******successCallback*******, *******failureCallBack*******, "*******plugin name registered in native class*******", "******* function name or parsed string*******", [defaults]);
    }
};