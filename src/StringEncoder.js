function rotate(letter, number) {
    const letterAsArr = letter.split('');
    let final = '';
    letterAsArr.forEach((_letter, index) => {
        // "abc".charCodeAt(0)
        // get the original index
        const originalCharCode = _letter.charCodeAt(0)
        // if no original index push it back



        let moveBy = originalCharCode + number;
        if (moveBy > 65535) {


            moveBy -= 65535

        }

        // move it by so so number;
        const encrypted = String.fromCharCode(moveBy)
        final += encrypted



    })

    return final

}
function rotateV2(letter, number) {
    let final = '';
    for (let i = 0; i < letter.length; i++) {

        // "abc".charCodeAt(0)
        // get the original index
        const originalCharCode = letter.charCodeAt(i)
        // if no original index push it back

        let moveBy = originalCharCode + number;
        if (moveBy > 65535) {
            moveBy -= 65535;
        }
        // move it by so so number;
        const encrypted = String.fromCharCode(moveBy);
        final += encrypted;
    }
    return final

}
//const all = 'abcdefghijklmnopqrstuvwxyz';
console.log(rotateV2('the boy is hungry', 2))

/*
Given a sample string "hello", encode the characters by a given number n

EXAMPLE
abc , 1 becomes bca
and
xyz , 2 becomes zxy
* */