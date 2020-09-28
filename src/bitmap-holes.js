
function bitmapHoles(strArr) {
    let bitmap = strArr.map(a => a.split(''));
    console.log(bitmap)
    let count = 0;

    const isValuesZero = (f, c) => {
        f.forEach((l, i) => {
            try {
                if (bitmap[l[0]][l[1]] == '0') {
                    //cover it;
                    bitmap[l[0]][l[1]] = '1'
                    //cover curr location;
                    bitmap[c[0]][c[1]] = '1'
                    console.log(bitmap)
                    count++
                }
            } catch (e) {

            }

        })


    }


    for (let i = 0; i < bitmap.length; i++) { // rows;
        const width = bitmap[i].length;
        for (let j = 0; j < width; j++) { // cols;
            if (bitmap[i][j] === "0") {
                const currIndex = [i, j]; // get the values of its directions;
                const upIndex = [i - 1, j];
                const downIndex = [i + 1, j];
                const leftIndex = [i, j - 1];
                const rightIndex = [i, j + 1];
                isValuesZero([upIndex, downIndex, leftIndex, rightIndex], currIndex);

            }
        }
    }
    return count;
}


const ans = bitmapHoles(["01111", "01101", "00011", "11110"])

console.log({ ans })