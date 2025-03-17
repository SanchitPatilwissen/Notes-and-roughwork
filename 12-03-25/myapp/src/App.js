import JsxDemo from './JsxDemo';
import Greet from './Greet';
import Counter from './Counter';
import Welcome from './Welcome';
import Effect from './Effect';

function App() {
  const a = 100;
  let b = 20;
  var c = a+b;

  return (
    <div className="App">
      <h1>Hello</h1>
      <JsxDemo />
      <h2>Sum of a and b is {c}</h2>
      <h2>
        {
          (a>10) ? "GOOD MORNING" : "GOOD EVENING"
        }
      </h2>
      <Greet day="Wednesday" name="Sancho" />
      <Counter />
      <Welcome />
      <Effect />
    </div>
  );
}

export default App;
