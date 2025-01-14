import { Link } from "react-router-dom";
function Navbar() {
  return (
    <>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">
          Employee
        </a>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
          <div class="navbar-nav">
            <Link class="nav-item nav-link " to="/show">
              Show
            </Link>
            <Link class="nav-item nav-link " to="/insert">
              Insert
            </Link>
            <Link class="nav-item nav-link " to="/update">
              Update
            </Link>
            <Link class="nav-item nav-link " to="/delete">
              Delete
            </Link>
          </div>
        </div>
      </nav>
    </>
  );
}
export default Navbar;
