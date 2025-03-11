import { Calculator } from "./Calculator"

describe('Class Calculator Testing', ()=>{
    let calc:Calculator;

    beforeEach(()=>{
        calc = new Calculator();
    })

    it("Addition Testing", ()=>{
        let res = calc.add(22, 33);
        expect(res).toBe(55);
    })

    it("Subtraction Testing", ()=>{
        let res = calc.sub(22, 33);
        expect(res).toBe(-11);
    })
})