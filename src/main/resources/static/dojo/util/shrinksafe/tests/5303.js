result = "";

(function() {
    CallMe = function(callback) {
        callback();
    };

    var say_hello_twice = function() {
        say_hello();

        CallMe(function(){
            say_hello();
        });
    };

    var say_hello = function() {
        result += 'beer world';
    };

    say_hello_twice();
})();
