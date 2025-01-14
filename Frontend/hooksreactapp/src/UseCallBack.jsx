import { useMemo, useState } from "react";
import { memo } from "react";
function UseCallBack(props) {
  return <>{console.log("callback hook")}</>;
}
export default memo(UseCallBack);

///memo will only owrk when there is no props coming
//for that we have to use useCallback where props are created
