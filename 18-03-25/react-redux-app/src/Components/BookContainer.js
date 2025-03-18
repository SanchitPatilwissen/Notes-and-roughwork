import React, { Component } from 'react'
import { useSelector } from 'react-redux'
import { useDispatch } from 'react-redux'
import { purchase_book } from "../reduxContainer/BookAction"

function BookContainer() {
    const noOfBooks = useSelector(state => state.NumberOfBooks)
    const dispatch = useDispatch()

    return (
        <div>
            <h1>Book Container</h1>
            <h2>Number of books - {noOfBooks}</h2>
            <button onClick={() => dispatch(purchase_book())}>Buy Book</button>
        </div>
    )
}

export default BookContainer