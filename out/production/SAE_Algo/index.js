function genererDonnees(numberLength) {
    let array = [];

    for (let i = 0; i < numberLength; i++) {
        array.push(Math.floor(Math.random() * numberLength));
    }

    return array;
}

function triBulles(array) {
    array.reduce((acc, cur) => {

    })
}