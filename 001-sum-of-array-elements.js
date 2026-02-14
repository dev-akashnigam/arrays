function findSum(arr) {
    const n = arr.length;

    let sum = 0;
    for(let element of arr) {
        sum += element;
    }

    return sum;
}

function main() {
    const arr = [10, 20, 30, 40, 50];
    const sum = findSum(arr);
    console.log(`Sum = ${sum}`);
}

main();