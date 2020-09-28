function solution(S) {
    const memory = {
        max: '',
        code:0,

    }


    S.split('').forEach(letter => {

        if (S.includes(letter.toLowerCase()) && S.includes(letter.toUpperCase()) && letter.toUpperCase().charCodeAt(0) > memory.code){
            memory.max = letter.toUpperCase();
            memory.code = letter.toUpperCase().charCodeAt(0);
        }

    })

    return memory.max;

}

console.log(solution('WeTestCodErs'))