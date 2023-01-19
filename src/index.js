let array = genererDonnees(20000);

let startTime = performance.now();

triBulles(array);

let endTime = performance.now();

console.log(`Temps de calcul en millisecondes: ${Math.floor(endTime - startTime)}`)

function genererDonnees(numberLength) {
    let array = [];

    for (let i = 0; i < numberLength; i++) {
        array.push(Math.floor(Math.random() * numberLength));
    }

    return array;
}

function triBulles(array) {
    let pivot;

    for (let i = 0; i < array.length - 1; i++) {
        for (let j = 0; j < array.length - i - 1; j++) {
            if(array[j] > array[j+1]) {
                pivot = array[j];
                array[j] = array[j+1];
                array[j+1] = pivot;
            }
        }
    }
    return array;
}