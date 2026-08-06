int addDigits(int num) {
    if(num<10){
        return num;
    }
    int sum=num%10 + addDigits(num/10);
    return addDigits(sum);
}