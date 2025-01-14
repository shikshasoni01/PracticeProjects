import Navbar from "./component/Navbar";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Show from "./component/Show";

function App() {
  return (
    <>
      <Router>
        <Navbar></Navbar>
        <Routes>
          <Route path="/show" element=<Show></Show>></Route>
        </Routes>
      </Router>
    </>
  );
}

export default App;
