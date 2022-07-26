// @ Author 
// Tomas Doherty


// calculate average of 10 numbers
function calculateAverage() {
    var numbers = document.getElementById("data").value;
    if (numbers != "") {
        numbers = numbers.split(",");
        if (numbers.length < 10 || numbers.length > 10) {
            alert("Invalid Input. Please Enter 10 comma separated numbers.");
            return;
        }
        var sum = 0;
        var max = numbers[0];
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] < 1 || numbers[i] > 100) {
                alert("Invalid Input. Please Enter numbers in the range 1 to 100.");
                return;
            }
            sum = parseInt(sum) + parseInt(numbers[i]);
            if (max < parseInt(numbers[i])) {
                max = parseInt(numbers[i]);
            }
        }

    } else {
        alert("Invalid Input. Please Enter 10 comma separated numbers.");
    }

}

