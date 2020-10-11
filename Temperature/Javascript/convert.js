function convert(temp) {
    return (temp - 32.0) * 5.0 / 9.0;
}
document.getElementById("answer").innerHTML += convert(prompt());