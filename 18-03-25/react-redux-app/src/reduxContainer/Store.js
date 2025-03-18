import { createStoreHook } from 'react-redux'
import { createStore } from 'redux'
import BookReducer from './BookReducers'

// const store = createStoreHook()
const store = createStore(BookReducer);

export default store;