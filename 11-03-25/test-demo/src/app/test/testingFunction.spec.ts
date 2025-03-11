import { addition } from "./testingFunction"

describe("Calculation testing", ()=>{
    it("Testing add function", ()=>{
        expect(addition(11, 22)).toBe(33);
    })
})

describe("String testing", ()=>{
    let i = 0;

    beforeAll(()=>{
        console.log("----------------Started---------------------");
        
    })

    afterAll(()=>{
        console.log("----------------Finished---------------------");
    })

    beforeEach(()=>{
        console.log("Before each Test case no. "+ ++i);
    })

    afterEach(()=>{
        console.log("After each Test case no. "+ i);
    })

    it("Testing string equality function using toBe", ()=>{
        let str = "Hello Everybody";
        expect(str).toBe("Hello Everybody");
        console.log("Testing string equality function using toBe");
    })

    it("Testing string equality function using toEqual", ()=>{
        let str = "Hello Everybody";
        expect(str).toEqual("Hello Everybody");
        console.log("Testing string equality function using toEqual");
    })

    it("Testing string with RegEx pattern", ()=>{
        let str = "Happy New Year 2025";
        expect(str).toMatch(/\d+/);
        console.log("Testing string with RegEx pattern");
    })
})

describe("Testing with JSON/ARRAY object", ()=>{
    it("Testing with deep checking", ()=>{
        let e1 = {"name" : "Sanju", "age":25};
        expect(e1).toEqual({"name" : "Sanju", "age" : 25});
    })

    it("Testing array", ()=>{
        let e1 = [11, 22, 33, 44, 55];
        expect(e1).toEqual([11, 22, 33, 44, 55]);
    })
})