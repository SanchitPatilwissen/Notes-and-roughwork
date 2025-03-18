const purchase_book = () => {
    console.log("Purchase book action created.......")
    return {
        type: "buy_book",
        payload: "I am buying book"
    }
}

export { purchase_book }