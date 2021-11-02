(this["webpackJsonpmmsc-frontend"] = this["webpackJsonpmmsc-frontend"] || []).push([[0], {
    10: function (e, t, r) {
        e.exports = {
            inputWrap: "UCM_inputWrap__17GAX",
            formDiv: "UCM_formDiv__1DwA5",
            fsublock: "UCM_fsublock__2rQWk",
            fsu: "UCM_fsu__8xdR7",
            fsuh4: "UCM_fsuh4__2im3k",
            fsublockmini: "UCM_fsublockmini__vKTEf",
            fsublockoption: "UCM_fsublockoption__bOje8",
            infoblock: "UCM_infoblock__3_O7n",
            infoblockDiv: "UCM_infoblockDiv__u3lp5",
            infoblockQuantity: "UCM_infoblockQuantity__1rKtQ",
            infoblockQuantityDetail: "UCM_infoblockQuantityDetail__Kx3DL",
            infoblockGroup: "UCM_infoblockGroup__2_YpM",
            awb: "UCM_awb__1kuv4",
            detailAndTotal: "UCM_detailAndTotal__1B62g",
            detail: "UCM_detail__1C5Fp",
            total: "UCM_total__1Ebut",
            MovementDetail: "UCM_MovementDetail__17TAU",
            movement: "UCM_movement__3O696",
            time: "UCM_time__1TPDj",
            validate: "UCM_validate__36WJE",
            validateMessage: "UCM_validateMessage__9SqlS",
            message: "UCM_message__3w0iI",
            publish: "UCM_publish__1DURc",
            errorValidation: "UCM_errorValidation__2QZhP",
            "received-from-block": "UCM_received-from-block__3wMEF",
            "received-from-input": "UCM_received-from-input__3FLqG",
            btnBlock: "UCM_btnBlock__2KESk",
            btnDelBlock: "UCM_btnDelBlock__3YEAr",
            btnAddBlock: "UCM_btnAddBlock__1i93k",
            btnBlockElement: "UCM_btnBlockElement__3D0WS",
            groupTitle: "UCM_groupTitle__1-ZYW",
            btnAddElement: "UCM_btnAddElement__APNmw",
            btnDelElement: "UCM_btnDelElement__2WHkW",
            divElement: "UCM_divElement__13SBd",
            elementTitle: "UCM_elementTitle__1Kogr",
            sendingInv: "UCM_sendingInv__nDNkw",
            sendingInvDiv: "UCM_sendingInvDiv__1yiyR",
            infoblockDivSIDetails: "UCM_infoblockDivSIDetails__3s6jQ",
            inputWrapSIDetail: "UCM_inputWrapSIDetail__1E6wk"
        }
    }, 211: function (e, t, r) {
    }, 329: function (e, t, r) {
    }, 330: function (e, t, r) {
        "use strict";
        r.r(t);
        var o = r(0), i = r.n(o), a = r(21), n = r.n(a), c = r(18), s = r(16), l = r.n(s), m = r(26), d = r(117),
            u = r.n(d), f = r(19), h = r(20), p = function () {
                function e() {
                    Object(f.a)(this, e)
                }

                return Object(h.a)(e, null, [{
                    key: "registration", value: function () {
                        var e = Object(m.a)(l.a.mark((function e(t) {
                            return l.a.wrap((function (e) {
                                for (; ;) switch (e.prev = e.next) {
                                    case 0:
                                        return e.next = 2, b.post("/V1/CreateAccount", t);
                                    case 2:
                                        return e.abrupt("return", e.sent);
                                    case 3:
                                    case"end":
                                        return e.stop()
                                }
                            }), e)
                        })));
                        return function (t) {
                            return e.apply(this, arguments)
                        }
                    }()
                }, {
                    key: "login", value: function () {
                        var e = Object(m.a)(l.a.mark((function e(t) {
                            return l.a.wrap((function (e) {
                                for (; ;) switch (e.prev = e.next) {
                                    case 0:
                                        return e.next = 2, b.post("/V1/authenticate", t);
                                    case 2:
                                        return e.abrupt("return", e.sent);
                                    case 3:
                                    case"end":
                                        return e.stop()
                                }
                            }), e)
                        })));
                        return function (t) {
                            return e.apply(this, arguments)
                        }
                    }()
                }, {
                    key: "logout", value: function () {
                        var e = Object(m.a)(l.a.mark((function e() {
                            return l.a.wrap((function (e) {
                                for (; ;) switch (e.prev = e.next) {
                                    case 0:
                                        return e.next = 2, b.post("/V1/logout");
                                    case 2:
                                        return e.abrupt("return", e.sent);
                                    case 3:
                                    case"end":
                                        return e.stop()
                                }
                            }), e)
                        })));
                        return function () {
                            return e.apply(this, arguments)
                        }
                    }()
                }, {
                    key: "refresh", value: function () {
                        var e = Object(m.a)(l.a.mark((function e() {
                            return l.a.wrap((function (e) {
                                for (; ;) switch (e.prev = e.next) {
                                    case 0:
                                        return e.next = 2, b.get("/V1/refresh");
                                    case 2:
                                        return e.abrupt("return", e.sent);
                                    case 3:
                                    case"end":
                                        return e.stop()
                                }
                            }), e)
                        })));
                        return function () {
                            return e.apply(this, arguments)
                        }
                    }()
                }]), e
            }(), C = u.a.create({withCredentials: !0, baseURL: "http://10.7.0.38:8082/API/"});
        C.interceptors.request.use((function (e) {
            return e.headers.Authorization = "Bearer ".concat(localStorage.getItem("token")), e
        })), C.interceptors.response.use((function (e) {
            return console.log("\u043f\u0440\u0438\u043d\u044f\u043b \u043e\u0442\u0432\u0435\u0442 \u043e\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u0430 ".concat(e)), e
        }), function () {
            var e = Object(m.a)(l.a.mark((function e(t) {
                var r, o;
                return l.a.wrap((function (e) {
                    for (; ;) switch (e.prev = e.next) {
                        case 0:
                            if (console.log("\u043f\u043e\u043b\u0443\u0447\u0438\u043b \u043e\u0448\u0438\u0431\u043a\u0443 \u043e\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u0430", t), r = t.config, console.log("\u0421\u0440\u0430\u0431\u043e\u0442\u0430\u043b \u0438\u043d\u0442\u0435\u0440\u0446\u0435\u043f\u0442\u043e\u0440 \u043a\u043e\u0434 \u043e\u0448\u0438\u0431\u043a\u0438 -------\x3e", r), e.prev = 3, !(401 === t.response.status && t.config && !t.config._isRetry || 403 === t.response.status && t.config && !t.config._isRetry)) {
                                e.next = 17;
                                break
                            }
                            return console.log("do -----------------------------", r), r._isRetry = !0, console.log("posle --------------------", r), console.log("\u041e\u0442\u043f\u0440\u0430\u0432\u0438\u043b \u0437\u0430\u043f\u0440\u043e\u0441 \u043d\u0430 \u0440\u0435\u0444\u0440\u0435\u0448"), e.next = 11, p.refresh();
                        case 11:
                            if (200 !== (o = e.sent).status) {
                                e.next = 17;
                                break
                            }
                            return localStorage.setItem("token", o.data.access_token), e.next = 16, C.request(r);
                        case 16:
                            return e.abrupt("return", e.sent);
                        case 17:
                            e.next = 22;
                            break;
                        case 19:
                            e.prev = 19, e.t0 = e.catch(3), console.log("Not authorize");
                        case 22:
                        case"end":
                            return e.stop()
                    }
                }), e, null, [[3, 19]])
            })));
            return function (t) {
                return e.apply(this, arguments)
            }
        }());
        var b = C, D = "ACTIVATE_LOADER", v = "DISABLE_LOADER", g = "USER_CREATE", A = "DELETE_USER", j = "SET_AUTH",
            O = "UNAUTH", T = function () {
                return {type: D}
            }, x = function () {
                return {type: v}
            }, S = function () {
                return {type: j}
            }, N = (r(211), r(13)), M = r(377), y = r(33), W = r(385), P = r(379), R = r(333), E = r(15), _ = r(3),
            k = r(382), F = r(335), I = r(388), U = r(1);
        _.b({
            Email: _.c("Enter your email").email("Enter a valid email").required("Email is required"),
            Password: _.c("Enter your password").min(8, "Password should be of minimum 8 characters length").required("Password is required"),
            Login: _.c("Enter your Login").min(2, "Login should be of minimum 2 characters length").required("Login is required"),
            CompanyName: _.c("Enter your company").min(2, "Company should be of minimum 2 characters length").required("Company is required")
        });

        function L(e) {
            var t = Object(y.b)(), r = (Object(y.c)((function (e) {
                return e.loader
            })), Object(c.g)()), o = Object(E.g)({
                initialValues: {
                    Email: "testuser@volgadnepr.com",
                    Login: "test",
                    Password: "12345",
                    CompanyName: "VolgaDnepr"
                }, onSubmit: function (e) {
                    var o = Object.entries(e).filter((function (e) {
                        return e[1] ? e[1].trim() : e[1]
                    }));
                    o.length && (o = Object.fromEntries(o), t(function (e, t, r) {
                        return function () {
                            var o = Object(m.a)(l.a.mark((function o(i) {
                                var a;
                                return l.a.wrap((function (o) {
                                    for (; ;) switch (o.prev = o.next) {
                                        case 0:
                                            return i(T()), o.prev = 1, o.next = 4, p.registration(e);
                                        case 4:
                                            a = o.sent, console.log("response in registration"), 200 === a.status && a.data.status ? (console.log("\u043e\u0442\u0432\u0435\u0442 \u043e\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u0430 \u043f\u0440\u0438 \u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438", a), alert("".concat(a.data.status)), r()) : (alert("\u041e\u0448\u0438\u0431\u043a\u0430: ".concat(a.data.error)), t.replace("/")), o.next = 13;
                                            break;
                                        case 9:
                                            o.prev = 9, o.t0 = o.catch(1), console.log(o.t0), alert("\u041e\u0448\u0438\u0431\u043a\u0430 HTTP: ".concat(o.t0));
                                        case 13:
                                            i(x());
                                        case 14:
                                        case"end":
                                            return o.stop()
                                    }
                                }), o, null, [[1, 9]])
                            })));
                            return function (e) {
                                return o.apply(this, arguments)
                            }
                        }()
                    }(o, r, i)))
                }
            }), i = e.closeModal;
            return Object(U.jsx)("div", {
                children: Object(U.jsxs)("form", {
                    onSubmit: o.handleSubmit,
                    children: [Object(U.jsx)(k.a, {
                        fullWidth: !0,
                        id: "email",
                        name: "Email",
                        label: "Email:*",
                        variant: "standard",
                        margin: "normal",
                        size: "normal",
                        value: o.values.Email,
                        onChange: o.handleChange,
                        error: o.touched.Email && Boolean(o.errors.Email),
                        helperText: o.touched.Email && o.errors.Email
                    }), Object(U.jsx)(k.a, {
                        fullWidth: !0,
                        id: "password",
                        name: "Password",
                        label: "Password:*",
                        type: "password",
                        variant: "standard",
                        margin: "normal",
                        size: "normal",
                        value: o.values.Password,
                        onChange: o.handleChange,
                        error: o.touched.Password && Boolean(o.errors.Password),
                        helperText: o.touched.Password && o.errors.Password
                    }), Object(U.jsx)(k.a, {
                        fullWidth: !0,
                        id: "company",
                        name: "CompanyName",
                        label: "Company name:*",
                        type: "text",
                        variant: "standard",
                        margin: "normal",
                        size: "normal",
                        value: o.values.CompanyName,
                        onChange: o.handleChange,
                        error: o.touched.CompanyName && Boolean(o.errors.CompanyName),
                        helperText: o.touched.CompanyName && o.errors.CompanyName
                    }), Object(U.jsx)(k.a, {
                        fullWidth: !0,
                        id: "name",
                        name: "Login",
                        label: "Name:*",
                        type: "text",
                        variant: "standard",
                        margin: "normal",
                        size: "normal",
                        value: o.values.Login,
                        onChange: o.handleChange,
                        error: o.touched.Login && Boolean(o.errors.Login),
                        helperText: o.touched.Login && o.errors.Login
                    }), Object(U.jsxs)(I.a, {
                        direction: "row",
                        justifyContent: "space-between",
                        alignItems: "center",
                        spacing: 12,
                        children: [Object(U.jsx)(F.a, {
                            size: "medium",
                            variant: "contained",
                            fullWidth: !0,
                            type: "submit",
                            children: "CREATE ACCOUNT"
                        }), Object(U.jsx)(F.a, {
                            size: "medium",
                            variant: "contained",
                            fullWidth: !0,
                            onClick: i,
                            children: "RETURN TO LOGIN"
                        })]
                    })]
                })
            })
        }

        var w = r(378), G = _.b({
            Login: _.c("Enter your Login").required("Login is required"),
            Password: _.c("Enter your password").min(4, "Password should be of minimum 8 characters length").required("Password is required")
        }), V = Object(M.a)((function (e) {
            return {
                root: {"& .MuiTextField-root": {margin: e.spacing(1), width: "25ch"}},
                head: {fontSize: "50px", textAlign: "center"},
                but: {color: "white", background: "blue"},
                modal: {display: "flex", alignItems: "center", justifyContent: "center"},
                paper: {
                    backgroundColor: e.palette.background.paper,
                    borderRadius: "10px",
                    boxShadow: e.shadows[5],
                    padding: e.spacing(2, 4, 3),
                    maxWidth: "500px"
                }
            }
        }));
        var z = r(12), $ = r(7), B = r.n($), q = {
            FSU15: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: ""
            },
            StatusCode: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: ""
            },
            ARR: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                CarrierCode: "",
                FlightNumber: "",
                DayofScheduledArrival: "",
                MonthofScheduledArrival: "",
                ActualTimeofGivenStatusEvent: "",
                DayChangeIndicatorMovement: "",
                AirportCodeofArrival: "",
                MovementShipmentDescriptionCode: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: "",
                TypeofTimeIndicatorDeparture: "",
                TimeDeparture: "",
                DayChangeIndicatorDeparture: "",
                TypeofTimeIndicatorArrival: "",
                TimeArrival: "",
                DayChangeIndicatorArrival: ""
            },
            DEP: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                CarrierCode: "",
                FlightNumber: "",
                DayofScheduledDeparture: "",
                MonthofScheduledDeparture: "",
                AirportCodeofDeparture: "",
                AirportCodeofArrival: "",
                MovementShipmentDescriptionCode: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: "",
                TypeofTimeIndicatorDeparture: "",
                TimeDeparture: "",
                DayChangeIndicatorDeparture: "",
                TypeofTimeIndicatorArrival: "",
                TimeArrival: "",
                DayChangeIndicatorArrival: ""
            },
            AWD: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                DayofDelivery: "",
                MonthofDelivery: "",
                ActualTimeofGivenStatusEvent: "",
                AirportCodeofDelivery: "",
                MovementShipmentDescriptionCode: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: ""
            },
            AWR: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeOfDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                CarrierCode: "",
                FlightNumber: "",
                DayofScheduledArrival: "",
                MonthofScheduledArrival: "",
                ActualTimeofGivenStatusEvent: "",
                DayChangeIndicatorMovement: "",
                AirportCodeofArrival: "",
                MovementShipmentDescriptionCode: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: "",
                TypeofTimeIndicatorDeparture: "",
                TimeDeparture: "",
                DayChangeIndicatorDeparture: "",
                TypeofTimeIndicatorArrival: "",
                TimeArrival: "",
                DayChangeIndicatorArrival: ""
            },
            BKD: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                CarrierCode: "",
                FlightNumber: "",
                AirportCodeofDeparture: "",
                AirportCodeofArrival: "",
                MovementShipmentDescriptionCode: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: "",
                DayofScheduledDeparture: "",
                MonthofScheduledDeparture: "",
                TypeofTimeIndicatorDeparture: "",
                TimeDeparture: "",
                DayChangeIndicatorDeparture: "",
                TypeofTimeIndicatorArrival: "",
                TimeArrival: "",
                DayChangeIndicatorArrival: ""
            },
            CCD: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                DayofClearance: "",
                MonthofClearance: "",
                ActualTimeofGivenStatusEvent: "",
                AirportCodeofClearance: "",
                MovementShipmentDescriptionCode: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: ""
            },
            CRC: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalNumberofPieces: "",
                TotalShipmentDescriptionCode: "",
                StatusCode: "",
                DayofReporting: "",
                ActualTimeofGivenStatusEvent: "",
                MonthofReporting: "",
                CarrierCode: "",
                AirportCodeofReporting: "",
                DayofScheduledDeparture: "",
                FlightNumber: "",
                AirportCodeofDeparture: "",
                MonthofScheduledDeparture: "",
                MovementShipmentDescriptionCode: "",
                AirportCodeofArrival: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: ""
            },
            DDL: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                DayofDeliverytoconsigneesdoor: "",
                MonthofDeliverytoconsigneesdoor: "",
                ActualTimeofGivenStatusEvent: "",
                AirportCodeofDeliverytoconsigneesdoor: "",
                MovementShipmentDescriptionCode: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: ""
            },
            DIS: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalNumberofPieces: "",
                TotalShipmentDescriptionCode: "",
                StatusCode: "",
                FlightNumber: "",
                CarrierCode: "",
                DayofDiscrepancy: "",
                ActualTimeofGivenStatusEvent: "",
                MonthofDiscrepancy: "",
                DiscrepancyCode: "",
                AirportCodeofDiscrepancy: "",
                MovementNumberofPieces: "",
                MovementShipmentDescriptionCode: "",
                MovementWeightCode: "",
                MovementWeight: ""
            },
            DLV: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalNumberofPieces: "",
                TotalShipmentDescriptionCode: "",
                StatusCode: "",
                DayofDelivery: "",
                ActualTimeofGivenStatusEvent: "",
                MonthofDelivery: "",
                MovementShipmentDescriptionCode: "",
                AirportCodeofDelivery: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: ""
            },
            FOH: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                DayofReceipt: "",
                MonthofReceipt: "",
                ActualTimeofGivenStatusEvent: "",
                MovementShipmentDescriptionCode: "",
                MovementAirportCodeofReceipt: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: "",
                ReceivedfromDetail: ""
            },
            MAN: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                CarrierCode: "",
                FlightNumber: "",
                DayofScheduledDeparture: "",
                MonthofScheduledDeparture: "",
                AirportCodeofDeparture: "",
                AirportCodeofArrival: "",
                MovementShipmentDescriptionCode: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: "",
                TypeofTimeIndicatorDeparture: "",
                TimeDeparture: "",
                DayChangeIndicatorDeparture: "",
                TypeofTimeIndicatorArrival: "",
                TimeArrival: "",
                DayChangeIndicatorArrival: ""
            },
            NFD: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                DayofNotification: "",
                MonthofNotification: "",
                ActualTimeofGivenStatusEvent: "",
                MovementShipmentDescriptionCode: "",
                MovementAirportCodeofNotification: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: ""
            },
            PRE: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                CarrierCode: "",
                FlightNumber: "",
                DayofScheduledDeparture: "",
                MonthofScheduledDeparture: "",
                AirportCodeofDeparture: "",
                AirportCodeofArrival: "",
                MovementShipmentDescriptionCode: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: "",
                TypeofTimeIndicatorDeparture: "",
                TimeDeparture: "",
                DayChangeIndicatorDeparture: "",
                TypeofTimeIndicatorArrival: "",
                TimeArrival: "",
                DayChangeIndicatorArrival: ""
            },
            RCF: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                CarrierCode: "",
                FlightNumber: "",
                DayofScheduledArrival: "",
                MonthofScheduledArrival: "",
                DayChangeIndicatorMovement: "",
                ActualTimeofGivenStatusEvent: "",
                AirportCodeofArrival: "",
                MovementShipmentDescriptionCode: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: ""
            },
            RCS: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalShipmentDescriptionCode: "",
                TotalNumberofPieces: "",
                StatusCode: "",
                DayofReceipt: "",
                MonthofReceipt: "",
                ActualTimeofGivenStatusEvent: "",
                MovementShipmentDescriptionCode: "",
                MovementAirportCodeofReceipt: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: "",
                ReceivedfromDetail: ""
            },
            RCT: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalNumberofPieces: "",
                TotalShipmentDescriptionCode: "",
                StatusCode: "",
                CarrierCode: "",
                DayofTransfer: "",
                ActualTimeofGivenStatusEvent: "",
                MonthofTransfer: "",
                MovementShipmentDescriptionCode: "",
                AirportCodeofTransfer: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: ""
            },
            TFD: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalNumberofPieces: "",
                TotalShipmentDescriptionCode: "",
                StatusCode: "",
                CarrierCode: "",
                DayofTransfer: "",
                ActualTimeofGivenStatusEvent: "",
                MonthofTransfer: "",
                MovementShipmentDescriptionCode: "",
                AirportCodeofTransfer: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: ""
            },
            TGC: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalNumberofPieces: "",
                TotalShipmentDescriptionCode: "",
                StatusCode: "",
                DayofTransfer: "",
                ActualTimeofGivenStatusEvent: "",
                MonthofTransfer: "",
                MovementShipmentDescriptionCode: "",
                AirportCodeofTransfer: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: ""
            },
            TRM: {
                TransmissionChannel: "",
                AirLinePrefix: "",
                SerialNumber: "",
                AirportCodeofOrigin: "",
                AirportCodeofDestination: "",
                ShipmentDescriptionCode: "",
                NumberofPieces: "",
                WeightCode: "",
                Weight: "",
                TotalNumberofPieces: "",
                TotalShipmentDescriptionCode: "",
                StatusCode: "",
                CarrierCode: "",
                MovementShipmentDescriptionCode: "",
                AirportCodeofTransfer: "",
                MovementNumberofPieces: "",
                MovementWeightCode: "",
                MovementWeight: ""
            }
        }, Z = {
            TransmissionChannel: _.c().trim().matches(/^(SITA|Edifly|Email)$/gm, "The \u201ctransmission channel type\u201d is not selected").required("The \u201ctransmission channel type\u201d is not selected"),
            AirLinePrefix: _.c().trim().matches(/^\d{3}$/gm, "The \u201cAirLine Prefix\u201d field has an incorrect format").required("The \u201cAirLine Prefix\u201d field is not filled"),
            SerialNumber: _.c().trim().matches(/^\d{8}$/gm, "The \u201cSerial Number\u201d field has an incorrect format").required("The \u201cSerial Number\u201d field is not filled"),
            AirportCodeofOrigin: _.c().trim().matches(/^[A-Za-z]{3}$/gm, "The \u201cAirport Code of Origin\u201d field has an incorrect format").required("The \u201cAirport Code of Origin\u201d field is not filled"),
            AirportCodeofDestination: _.c().trim().matches(/^[A-Za-z]{3}$/gm, "The \u201cAirport Code of Destination\u201d  field has an incorrect format").required("The \u201cAirport Code of Destination\u201d field is not filled"),
            ShipmentDescriptionCode: _.c().trim().matches(/^[A-Za-z]{1}$/gm, "The \u201cShipment Description Code\u201d is not selected").required("The \u201cShipment Description Code\u201d is not selected"),
            NumberofPieces: _.c().trim().matches(/^\d{1,4}$/gm, "The \u201cNumber of Pieces\u201d  field has an incorrect format").required("The \u201cNumber of Pieces\u201d field is not filled"),
            WeightCode: _.c().trim().matches(/^[A-Za-z]{1}$/gm, "incorrect"),
            Weight: _.c().trim().matches(/^\d{1,7}(\.\d{1,2})?$/gm, "Digit from 0.00 to 9999999.99"),
            TotalShipmentDescriptionCode: _.c().trim().matches(/^[t|T]{1}$/gm, "Incorrect"),
            TotalNumberofPieces: _.c().trim().matches(/^\d{1,4}$/gm, "The \u201cTotal Number of Pieces\u201d  field has an incorrect format").when("ShipmentDescriptionCode", {
                is: "P",
                then: _.c().required("The \u201cTotal Number of Pieces\u201d field is not filled")
            }),
            StatusCode: _.c().trim().matches(/^[A-Za-z]{3}$/gm, ""),
            CarrierCode: _.c().trim().matches(/^[a-zA-Z]{2}|[a-zA-Z]\d|\d[a-zA-Z]$/gm, "Two 'Carrier Code' field has an incorrect format"),
            FlightNumber: _.c().trim().matches(/^\d{3}(\d{1}|[A-Za-z])?$/gm, "The 'Flight Number' field has an incorrect format"),
            DayofScheduledArrival: _.c().trim().matches(/^\d{2}$/gm).required("The \u201cDay of Scheduled Arrival\u201d is not selected"),
            DayofTransfer: _.c().trim().matches(/^\d{2}$/gm).required("The \u201cDay of Transfer\u201d is not selected"),
            DayofDelivery: _.c().trim().matches(/^\d{2}$/gm),
            DayofClearance: _.c().trim().matches(/^\d{2}$/gm).required("The \u201cDay of Clearance\u201d is not selected"),
            MonthofClearance: _.c().trim().matches(/^[A-Za-z]{3}$/gm).required("The \u201cMonth of Clearance\u201d is not selected"),
            MonthofDelivery: _.c().trim().matches(/^[A-Za-z]{3}$/gm),
            DayofReceipt: _.c().trim().matches(/^\d{2}$/gm).required("The \u201cDay of Transfer\u201d is not selected"),
            DayofNotification: _.c().trim().matches(/^\d{2}$/gm).required("The \u201cDay of Transfer\u201d is not selected"),
            MonthofScheduledArrival: _.c().trim().matches(/^[A-Za-z]{3}$/gm).required("The \u201cMonth of Scheduled Arrival\u201d is not selected"),
            MonthofTransfer: _.c().trim().matches(/^[A-Za-z]{3}$/gm).required("The \u201cMonth of Transfer\u201d is not selected"),
            MonthofReceipt: _.c().trim().matches(/^[A-Za-z]{3}$/gm).required("The \u201cMonth of Transfer\u201d is not selected"),
            MonthofNotification: _.c().trim().matches(/^[A-Za-z]{3}$/gm).required("The \u201cMonth of Transfer\u201d is not selected"),
            DayofScheduledDeparture: _.c().trim().matches(/^\d{2}$/gm),
            MonthofScheduledDeparture: _.c().trim().matches(/^[A-Za-z]{3}$/gm),
            DayofReporting: _.c().trim().matches(/^\d{2}$/gm).required("The \u201cDay of Reporting\u201d is not selected"),
            MonthofReporting: _.c().trim().matches(/^[A-Za-z]{3}$/gm).required("The \u201cMonth of Reporting\u201d is not selected"),
            DayofDeliverytoconsigneesdoor: _.c().trim().matches(/^\d{2}$/gm).required("The \u201cDay of Delivery to consignee\u2019s door\u201d is not selected"),
            MonthofDeliverytoconsigneesdoor: _.c().trim().matches(/^[A-Za-z]{3}$/gm).required("The \u201cMonth of Delivery to consignee\u2019s door\u201d is not selected"),
            DayofDiscrepancy: _.c().trim().matches(/^\d{2}$/gm).required("The \u201cDay of Discrepancy\u201d is not selected"),
            MonthofDiscrepancy: _.c().trim().matches(/^[A-Za-z]{3}$/gm).required("The \u201cMonth of Discrepancy\u201d is not selected"),
            ActualTimeofGivenStatusEvent: _.c().trim().matches(/^\d{4}$/gm, "The \u201cActual Time of Given Status Event\u201d  field has an incorrect format").required("The \u201cActual Time of Given Status Event\u201d field is not filled"),
            DayChangeIndicatorMovement: _.c().trim().matches(/^[A-Za-z]{1}$/gm),
            AirportCodeofClearance: _.c().trim().matches(/^[A-Za-z]{3}$/gm, "The \u201cAirport Code of Clearance\u201d field is not filled").required("The \u201cAirport Code of Clearance\u201d  field has an incorrect format"),
            AirportCodeofDelivery: _.c().trim().matches(/^[A-Za-z]{3}$/gm, "The \u201cAirport Code of Delivery\u201d  field has an incorrect format").required("The \u201cAirport Code of Deliveryl\u201d field is not filled"),
            AirportCodeofDeparture: _.c().trim().matches(/^[A-Za-z]{3}$/gm, "The \u201cAirport Code of  Departure\u201d field has an incorrect format").required("The \u201cAirport Code of Departure\u201d field is not filled"),
            AirportCodeofTransfer: _.c().trim().matches(/^[A-Za-z]{3}$/gm, "The \u201cAirport Code of Transfer\u201d  field has an incorrect format").required("The \u201cAirport Code of Transfer\u201d field is not filled"),
            AirportCodeofReceipt: _.c().trim().matches(/^[A-Za-z]{3}$/gm, "The \u201cAirport Code of Transfer\u201d  field has an incorrect format").required("The \u201cAirport Code of Transfer\u201d field is not filled"),
            AirportCodeofNotification: _.c().trim().matches(/^[A-Za-z]{3}$/gm, "The \u201cAirport Code of Transfer\u201d  field has an incorrect format").required("The \u201cAirport Code of Transfer\u201d field is not filled"),
            AirportCodeofArrival: _.c().trim().matches(/^[A-Za-z]{3}$/gm, "The \u201cAirport Code of Arrival\u201d  field has an incorrect format").required("The \u201cAirport Code of Arrival\u201d field is not filled"),
            AirportCodeofReporting: _.c().trim().matches(/^[A-Za-z]{3}$/gm, "The \u201cAirport Code of Reporting\u201d  field has an incorrect format").required("The \u201cAirport Code of Reporting\u201d field is not filled"),
            AirportCodeofDeliverytoconsigneesdoor: _.c().trim().matches(/^[A-Za-z]{3}$/gm, "The \u201cAirport Code of Delivery to consignee\u2019s door\u201d field has an incorrect format").required("The \u201cAirport Code of Delivery to consignee\u2019s door\u201d field is not filled"),
            AirportCodeofDiscrepancy: _.c().trim().matches(/^[A-Za-z]{3}$/gm, "The \u201cAirport Code of Discrepancy\u201d  field has an incorrect format").required("The \u201cAirport Code of Discrepancy\u201d field is not filled"),
            DiscrepancyCode: _.c().trim().matches(/^[A-Za-z]{4}$/gm).required("The \u201cDiscrepancy Code\u201d is not selected"),
            MovementShipmentDescriptionCode: _.c().trim().matches(/^[A-Za-z]{1}$/gm).required("The \u201cMovement Shipment Description Code\u201d is not selected"),
            MovementNumberofPieces: _.c().trim().matches(/^\d{1,4}$/gm, "The \u201cMovement Number of Pieces\u201d  field has an incorrect format").required("The \u201cMovement Number of Pieces\u201d field is not filled"),
            MovementWeightCode: _.c().trim().matches(/^[A-Za-z]{1}$/gm),
            MovementWeight: _.c().trim().matches(/^\d{1,7}(\.\d{1,2})?$/gm, "Digit from 0.00 to 9999999.99"),
            TypeofTimeIndicatorDeparture: _.c().trim().matches(/^[A-Za-z]{1}$/gm),
            TimeDeparture: _.c().trim().matches(/^(?:0[0-9]|1[1-9]|2[0123])(?:0[1-9]|[1-5][0-9]|00)$/gm, "Incorrect format"),
            DayChangeIndicatorDeparture: _.c().trim().matches(/^[A-Za-z]{1}$/gm),
            TypeofTimeIndicatorArrival: _.c().trim().matches(/^[A-Za-z]{1}$/gm),
            TimeArrival: _.c().trim().matches(/^(?:0[0-9]|1[1-9]|2[0123])(?:0[1-9]|[1-5][0-9]|00)$/gm, "Incorrect format"),
            DayChangeIndicatorArrival: _.c().trim().matches(/^[A-Za-z]{1}$/gm),
            ReceivedfromDetail: _.c().trim().matches(/^.{1,35}$/gm, "Incorrect format, maximum 35 symbols")
        }, K = {
            TransmissionChannel: _.c().trim().matches(/^(SITA|Edifly|Email)$/gm, "The \u201ctransmission channel type\u201d is not selected").required("The \u201ctransmission channel type\u201d is not selected"),
            CarrierCode: _.c().trim().matches(/^(([A-Za-z0-9]{2})|([A-Za-z0-9]{2}[A-Za-z]{1}))$/gm, "The 'Carrier Code' field has an incorrect format").required("The \u201cCarrier Code\u201d is not selected"),
            FlightNumberFirst: _.c().trim().matches(/^(([0-9]{1,4})|(([0-9]{1,4})[A-Za-z]{1}))$/gm, "The 'FlightNumberFirst' field has an incorrect format").required("The \u201cFlightNumberFirst\u201d is not selected"),
            FlightNumberSecond: _.c().trim().matches(/^(([0-9]{1,4})|(([0-9]{1,4})[A-Za-z]{1}))$/gm, "Two 'FlightNumberSecond' field has an incorrect format"),
            DayOfMonth: _.c().trim().matches(/^\d{2}$/gm, "The 'DayOfMonth' field has an incorrect format").required("The \u201cDayOfMonth\u201d is not selected"),
            AircraftRegistration: _.c().trim().matches(/^[A-Za-z0-9]{5,7}$/gm, "The 'AircraftRegistration' field has an incorrect format").required("The \u201cAircraftRegistration\u201d is not selected"),
            AirportCode: _.c().trim().matches(/^[A_Za-z]{3}$/gm, "The 'AirportCode' field has an incorrect format").required("The \u201cAirportCode\u201d is not selected"),
            IN: _.a(_.b({
                Element: _.a(_.b({
                    ULDIATACode: _.c().trim().matches(/^[a-zA-Z]{1}[a-zA-Z\d]{2}$/gm, "ULDIATACode field has an incorrect format").required("The \u201cULDIATACode\u201d is not selected"),
                    ULDSerialNumber: _.c().trim().matches(/^[A-Za-z0-9]{1}\d{3,11}$/gm, "The 'ULDSerialNumber' field has an incorrect format").required("The ULDSerialNumber is not selected"),
                    ULDOwnerCode: _.c().trim().matches(/^(([A-Za-z0-9]{2})|([A-Za-z0-9]{2}[A-Za-z]{1}))$/gm, "The 'ULDOwnerCode' field has an incorrect format")
                })).min(1).max(5)
            })).min(1),
            OUT: _.a(_.b({
                Element: _.a(_.b({
                    ULDIATACode: _.c().trim().matches(/^[a-zA-Z]{1}[a-zA-Z\d]{2}$/gm, "ULDIATACode field has an incorrect format").required("The \u201cULDIATACode\u201d is not selected"),
                    ULDSerialNumber: _.c().trim().matches(/^[A-Za-z0-9]{1}\d{3,11}$/gm, "The 'ULDSerialNumber' field has an incorrect format").required("The ULDSerialNumber is not selected"),
                    ULDOwnerCode: _.c().trim().matches(/^(([A-Za-z0-9]{2})|([A-Za-z0-9]{2}[A-Za-z]{1}))$/gm, "The 'ULDOwnerCode' field has an incorrect format"),
                    AirportCodeofUnloading: _.c().trim().matches(/^[A_Za-z]{3}$/gm, "The 'AirportCode' field has an incorrect format").required("The AirportCode is not selected"),
                    ContentCode: _.c().trim().matches(/^[A_Za-z]{1}$/gm, "The 'ContentCode' field has an incorrect format")
                })).min(1).max(3)
            })).min(1),
            SIDetail: _.a(_.c().trim().matches(/^.{1,61}$/gm, "Incorrect format, maximum 61 symbols")).min(1)
        };

        function H(e) {
            return Object(U.jsx)("p", {className: B.a.errorValidation, children: e.children})
        }

        var Q = i.a.memo((function (e) {
            var t = e.name, r = e.text, o = e.disabled, i = (e.blockId, e.inputId, e.placeholder), a = e.classname;
            return Object(U.jsxs)("div", {
                className: B.a[a],
                children: [Object(U.jsxs)("label", {
                    htmlFor: t,
                    children: [r, Object(U.jsx)(E.a, {name: t, component: H})]
                }), Object(U.jsx)(E.b, {
                    className: B.a.infoblockDiv,
                    type: "text",
                    placeholder: i,
                    name: t,
                    disabled: o
                })]
            })
        })), X = r(30);

        function J(e) {
            var t = Object(E.f)(e), r = Object(N.a)(t, 1)[0], o = e.arrOfValue, i = e.text, a = e.name, n = e.stylename;
            return Object(U.jsx)(U.Fragment, {
                children: Object(U.jsxs)("div", {
                    className: B.a.inputWrap,
                    children: [Object(U.jsxs)("label", {
                        htmlFor: a,
                        children: [i, Object(U.jsx)(E.a, {name: a, component: H})]
                    }), Object(U.jsx)("select", Object(X.a)(Object(X.a)(Object(X.a)({className: n}, e), r), {}, {
                        children: o.map((function (e, t) {
                            return 0 === t ? Object(U.jsx)("option", {
                                value: "",
                                children: e
                            }, e) : Object(U.jsx)("option", {value: e, children: e}, e)
                        }))
                    }))]
                })
            })
        }

        function Y(e) {
            var t = Object(E.h)(), r = t.values.ShipmentDescriptionCode, o = t.touched, a = t.setFieldValue,
                n = Object(E.f)(e), c = Object(N.a)(n, 1)[0], s = e.text, l = e.name;
            return i.a.useEffect((function () {
                "P" === r.trim() ? a("TotalShipmentDescriptionCode", "T") : (a("TotalShipmentDescriptionCode", ""), a("TotalNumberofPieces", ""))
            }), [o.ShipmentDescriptionCode, r, a]), Object(U.jsxs)("div", {
                className: B.a.inputWrap,
                children: [Object(U.jsx)("label", {htmlFor: l, children: s}), Object(U.jsx)(E.a, {
                    name: l,
                    component: H
                }), Object(U.jsx)("input", Object(X.a)(Object(X.a)(Object(X.a)({}, e), c), {}, {disabled: !0}))]
            })
        }

        var ee = {
            AWD: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "DayofDelivery", "MonthofDelivery", "ActualTimeofGivenStatusEvent", "/", "AirportCodeofDelivery", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight"],
            AWR: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "CarrierCode", "FlightNumber", "/", "DayofScheduledArrival", "MonthofScheduledArrival", "ActualTimeofGivenStatusEvent", "-", "DayChangeIndicatorMovement", "/", "AirportCodeofArrival", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight", "/", "TypeofTimeIndicatorDeparture", "TimeDeparture", "-", "DayChangeIndicatorDeparture", "/", "TypeofTimeIndicatorArrival", "TimeArrival", "-", "DayChangeIndicatorArrival"],
            CCD: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "DayofClerance", "MonthofClerance", "ActualTimeofGivenStatusEvent", "/", "AirportCodeofClerance", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight"],
            BKD: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "CarrierCode", "FlightNumber", "/", "DayofScheduledDeparture", "MonthofScheduledDeparture", "/", "AirportCodeofDeparture", "AirportCodeofArrival", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight", "/", "TypeofTimeIndicatorDeparture", "TimeDeparture", "-", "DayChangeIndicatorDeparture", "/", "TypeofTimeIndicatorArrival", "TimeArrival", "-", "DayChangeIndicatorArrival"],
            CRC: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "DayofReporting", "MonthofReporting", "ActualTimeofGivenStatusEvent", "/", " AirportCodeofReporting", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight", "/", "CarrierCode", "FlightNumber", "/", "DayofScheduledDeparture", " MonthofScheduledDeparture", "/", "AirportCodeofDeparture", "AirportCodeofArrival"],
            DDL: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "DayofDeliverytoconsigneesdoor", "MonthofDeliverytoconsigneesdoor", " ActualTimeofGivenStatusEvent", "/", " AirportCodeofDeliverytoconsigneesdoor", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight"],
            DEP: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "CarrierCode", "FlightNumber", "/", "DayofScheduledDeparture", "MonthofScheduledDeparture", "/", "AirportCodeofDeparture", "AirportCodeofArrival", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight", "/", "TypeofTimeIndicatorDeparture", "TimeDeparture", "-", "DayChangeIndicatorDeparture", "/", "TypeofTimeIndicatorArrival", " TimeArrival", "-", "DayChangeIndicatorArrival"],
            ARR: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "CarrierCode", "FlightNumber", "/", "DayofScheduledArrival", "MonthofScheduledArrival", "ActualTimeofGivenStatusEvent", "-", "DayChangeIndicatorMovement", "/", "AirportCodeofArrival", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight", "/", "TypeofTimeIndicatorDeparture", "TimeDeparture", "-", "DayChangeIndicatorDeparture", "/", "TypeofTimeIndicatorArrival", "TimeArrival", "-", "DayChangeIndicatorArrival"],
            DIS: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "CarrierCode", "FlightNumber", "/", "DayofDiscrepancy", "MonthofDiscrepancy", "ActualTimeofGivenStatusEvent", "/", "AirportCodeofDiscrepancy", "/", "DiscrepancyCode", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight"],
            DLV: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "DayofDelivery", "MonthofDelivery", "ActualTimeofGivenStatusEvent", "/", "AirportCodeofDelivery", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight"],
            FOH: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "DayofReceipt", "MonthofReceipt", "ActualTimeofGivenStatusEvent", "/", "AirportCodeofReceipt", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight"],
            MAN: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "CarrierCode", "FlightNumber", "/", "DayofScheduledDeparture", "MonthofScheduledDeparture", "/", "AirportCodeofDeparture", "AirportCodeofArrival", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight", "/", "TypeofTimeIndicatorDeparture", "TimeDeparture", "-", "DayChangeIndicatorDeparture", "/", "TypeofTimeIndicatorArrival", "TimeArrival", "-", "DayChangeIndicatorArrival"],
            NFD: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "DayofNotification", "MonthofNotification", "ActualTimeofGivenStatusEvent", "/", "AirportCodeofNotification", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight"],
            PRE: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "CarrierCode", "FlightNumber", "/", "DayofScheduledDeparture", "MonthofScheduledDeparture", "/", "AirportCodeofDeparture", "AirportCodeofArrival", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight", "/", "TypeofTimeIndicatorDeparture", "TimeDeparture", "-", "DayChangeIndicatorDeparture", "/", "TypeofTimeIndicatorArrival", "TimeArrival", "-", "DayChangeIndicatorArrival"],
            RCF: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "CarrierCode", "FlightNumber", "/", "DayofScheduledArrival", "MonthofScheduledArrival", "ActualTimeofGivenStatusEvent", "-", "DayChangeIndicatorMovement", "/", "AirportCodeofArrival", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight"],
            RCS: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "DayofReceipt", "MonthofReceipt", "ActualTimeofGivenStatusEvent", "/", "MovementAirportCodeofReceipt", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight", "/", "ReceivedfromDetail"],
            RCT: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "CarrierCode", "/", "DayofTransfer", "MonthofTransfer", "ActualTimeofGivenStatusEvent", "/", "AirportCodeofTransfer", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight"],
            TFD: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "CarrierCode", "/", "DayofTransfer", "MonthofTransfer", "ActualTimeofGivenStatusEvent", "/", "AirportCodeofTransfer", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight"],
            TGC: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "DayofTransfer", "MonthofTransfer", "ActualTimeofGivenStatusEvent", "/", " AirportCodeofTransfer", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight"],
            TRM: ["AirLinePrefix", "-", "SerialNumber", "AirportCodeofOrigin", "AirportCodeofDestination", "/", "ShipmentDescriptionCode", "NumberofPieces", "WeightCode", "Weight", "TotalShipmentDescriptionCode", "TotalNumberofPieces", "StatusCode", "/", "CarrierCode", "/", "AirportCodeofTransfer", "/", "MovementShipmentDescriptionCode", "MovementNumberofPieces", "MovementWeightCode", "MovementWeight"],
            StatusCode: [1],
            FSU15: [2]
        }, te = r(170), re = r.n(te), oe = (r(329), {
            content: {
                display: "flex",
                justifyContent: "center",
                flexWrap: "wrap",
                height: "200px",
                width: "350px",
                top: "48%",
                left: "48%",
                right: "auto",
                bottom: "auto",
                margin: "0 auto",
                transform: "translate(-50%, -50%)"
            }
        });

        function ie(e) {
            var t = e.text, r = e.modalIsOpen, o = e.setIsOpen;
            return Object(U.jsx)(U.Fragment, {
                children: Object(U.jsx)(re.a, {
                    isOpen: r,
                    onRequestClose: function () {
                        return o(!1)
                    },
                    style: oe,
                    contentLabel: "Modal",
                    children: Object(U.jsxs)("div", {
                        className: "modal-div",
                        children: [t, Object(U.jsx)("form", {
                            children: Object(U.jsx)("button", {
                                className: "modal-btn",
                                onClick: function () {
                                    return o(!1)
                                },
                                children: "\u0417\u0430\u043a\u0440\u044b\u0442\u044c \u043e\u043a\u043d\u043e"
                            })
                        })]
                    })
                })
            })
        }

        var ae = r(38), ne = r.n(ae);

        function ce() {
            return Object(U.jsxs)("div", {
                className: ne.a.validate,
                children: ["FSU15 ", Object(U.jsx)("br", {}), "020-12345675LAXJED/T12", Object(U.jsx)("br", {}), "ARR/LH451/10JUL0700/FRA/T12"]
            })
        }

        function se(e) {
            var t = e.validate, r = e.CurValidatioMessage, o = e.createValidationMessage, i = e.values,
                a = e.curFSUSchema, n = e.setCurValidatioMessage, c = e.selectFSUValue, s = e.setValidate;
            return Object(U.jsxs)("div", {
                className: ne.a.validateMessage,
                children: [!1 === t ? Object(U.jsx)(ce, {}) : Object(U.jsx)("div", {
                    className: ne.a.validate,
                    children: r
                }), !1 === t ? Object(U.jsx)("button", {
                    className: ne.a.message, onClick: function (e) {
                        e.preventDefault(), o(i, a, n, c), s(!0)
                    }, children: "Validate message"
                }) : Object(U.jsxs)("button", {
                    className: ne.a.message, onClick: function (e) {
                        e.preventDefault(), s(!1)
                    }, children: ["Show example", " "]
                })]
            })
        }

        var le = function () {
                function e() {
                    Object(f.a)(this, e)
                }

                return Object(h.a)(e, null, [{
                    key: "FSUmessage", value: function () {
                        var e = Object(m.a)(l.a.mark((function e(t, r) {
                            return l.a.wrap((function (e) {
                                for (; ;) switch (e.prev = e.next) {
                                    case 0:
                                        return e.next = 2, b.post("/V1/FSU_".concat(r), t);
                                    case 2:
                                        return e.abrupt("return", e.sent);
                                    case 3:
                                    case"end":
                                        return e.stop()
                                }
                            }), e)
                        })));
                        return function (t, r) {
                            return e.apply(this, arguments)
                        }
                    }()
                }, {
                    key: "UCMmessage", value: function () {
                        var e = Object(m.a)(l.a.mark((function e(t) {
                            return l.a.wrap((function (e) {
                                for (; ;) switch (e.prev = e.next) {
                                    case 0:
                                        return e.next = 2, b.post("/V1/UCM", t);
                                    case 2:
                                        return e.abrupt("return", e.sent);
                                    case 3:
                                    case"end":
                                        return e.stop()
                                }
                            }), e)
                        })));
                        return function (t) {
                            return e.apply(this, arguments)
                        }
                    }()
                }]), e
            }(),
            me = ["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"],
            de = ["P", "N", "S", "T", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"],
            ue = ["JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "OCT", "NOV", "DEC"];
        var fe = r(10), he = r.n(fe), pe = function (e) {
            var t = e.names, r = e.texts, o = e.indexGroupEl, i = e.values, a = e.push, n = e.remove, c = e.name,
                s = e.placeholders;
            return Object(U.jsxs)(U.Fragment, {
                children: [Object(U.jsxs)("h5", {
                    className: he.a.groupTitle,
                    children: ["Group ", "".concat(o + 1)]
                }), Object(U.jsxs)("div", {
                    className: he.a.infoblockGroup, children: [t.map((function (e, i) {
                        return Object(U.jsx)(Q, {
                            name: "".concat(c, "[").concat(o, "].").concat(t[i]),
                            text: r[i],
                            placeholder: s[i],
                            classname: "inputWrap"
                        })
                    })), Object(U.jsxs)("div", {
                        className: he.a.btnBlock,
                        children: [Object(U.jsx)("button", {
                            className: he.a.btnAddBlock,
                            disabled: i.length > 4,
                            onClick: function (e) {
                                e.preventDefault(), a({ULDIATACode: "", ULDSerialNumber: "", ULDOwnerCode: ""})
                            },
                            children: "Add Group"
                        }), Object(U.jsx)("button", {
                            className: he.a.btnDelBlock,
                            disabled: i.length < 2,
                            onClick: function (e) {
                                e.preventDefault(), n(o)
                            },
                            children: "Delete group"
                        })]
                    })]
                })]
            })
        }, Ce = i.a.memo(pe), be = function (e) {
            var t = e.values, r = e.arrayOfGroup, o = e.namesArrForGroup1, i = e.textsArrForGroup1,
                a = e.setArrayOfGroup, n = e.placeholdersArrForGroup1;
            return Object(U.jsx)(U.Fragment, {
                children: Object(U.jsx)(E.c, {
                    name: "IN", children: function (e) {
                        var c = e.push, s = e.remove;
                        return Object(U.jsx)(U.Fragment, {
                            children: t.IN.map((function (e, l) {
                                return Object(U.jsxs)("div", {
                                    className: he.a.infoblock,
                                    children: [Object(U.jsxs)("div", {
                                        className: he.a.btnBlockElement,
                                        children: [Object(U.jsx)("button", {
                                            className: he.a.btnAddElement,
                                            onClick: function (e) {
                                                e.preventDefault(), c({
                                                    Element: [{
                                                        ULDIATACode: "",
                                                        ULDSerialNumber: "",
                                                        ULDOwnerCode: ""
                                                    }]
                                                })
                                            },
                                            children: "Add Element"
                                        }), Object(U.jsx)("button", {
                                            className: he.a.btnDelElement,
                                            disabled: t.IN.length < 2,
                                            onClick: function (e) {
                                                e.preventDefault(), s(l)
                                            },
                                            children: "Delete Element"
                                        })]
                                    }), Object(U.jsx)(E.c, {
                                        name: "IN[".concat(l, "].Element"), children: function (e) {
                                            var c = e.push, s = e.remove, m = e.replace;
                                            return Object(U.jsxs)("div", {
                                                className: he.a.divElement,
                                                children: [Object(U.jsx)("p", {
                                                    className: he.a.elementTitle,
                                                    children: "Element".concat(l + 1)
                                                }), t.IN[l].Element.map((function (e, d) {
                                                    return Object(U.jsx)(Ce, {
                                                        name: "IN[".concat(l, "].Element"),
                                                        values: t.IN[l].Element,
                                                        indexElement: l,
                                                        push: c,
                                                        remove: s,
                                                        replace: m,
                                                        id: e,
                                                        placeholders: n,
                                                        arrayOfGroup: r,
                                                        names: o,
                                                        texts: i,
                                                        setArrayOfG: a,
                                                        indexGroupEl: d
                                                    }, e)
                                                }))]
                                            })
                                        }
                                    })]
                                })
                            }))
                        })
                    }
                })
            })
        }, De = i.a.memo(be), ve = function (e) {
            var t = e.names, r = e.texts, o = e.indexGroupEl, i = e.values, a = e.push, n = e.remove, c = e.name,
                s = e.placeholders;
            return Object(U.jsxs)(U.Fragment, {
                children: [Object(U.jsxs)("h5", {
                    className: he.a.groupTitle,
                    children: ["Group ", "".concat(o + 1)]
                }), Object(U.jsxs)("div", {
                    className: he.a.infoblockGroup, children: [t.map((function (e, i) {
                        return Object(U.jsx)(Q, {
                            name: "".concat(c, "[").concat(o, "].").concat(t[i]),
                            text: r[i],
                            placeholder: s[i],
                            classname: "inputWrap"
                        })
                    })), Object(U.jsxs)("div", {
                        className: he.a.btnBlock,
                        children: [Object(U.jsx)("button", {
                            className: he.a.btnAddBlock,
                            disabled: i.length > 2,
                            onClick: function (e) {
                                e.preventDefault(), a({
                                    ULDIATACode: "",
                                    ULDSerialNumber: "",
                                    ULDOwnerCode: "",
                                    AirportCodeofUnloading: "",
                                    ContentCode: ""
                                })
                            },
                            children: "Add Group"
                        }), Object(U.jsx)("button", {
                            className: he.a.btnDelBlock,
                            disabled: i.length < 2,
                            onClick: function (e) {
                                e.preventDefault(), n(o)
                            },
                            children: "Delete group"
                        })]
                    })]
                })]
            })
        }, ge = i.a.memo(ve), Ae = function (e) {
            var t = e.values, r = e.arrayOfGroup, o = e.namesArrForGroup1, i = e.textsArrForGroup1,
                a = e.setArrayOfGroup, n = e.placeholdersArrForGroup1;
            return Object(U.jsx)(U.Fragment, {
                children: Object(U.jsx)(E.c, {
                    name: "OUT", children: function (e) {
                        var c = e.push, s = e.remove;
                        return Object(U.jsx)(U.Fragment, {
                            children: t.OUT.map((function (e, l) {
                                return Object(U.jsxs)("div", {
                                    className: he.a.infoblock,
                                    children: [Object(U.jsxs)("div", {
                                        className: he.a.btnBlockElement,
                                        children: [Object(U.jsx)("button", {
                                            className: he.a.btnAddElement,
                                            onClick: function (e) {
                                                e.preventDefault(), c({
                                                    Element: [{
                                                        ULDIATACode: "",
                                                        ULDSerialNumber: "",
                                                        ULDOwnerCode: "",
                                                        AirportCodeofUnloading: "",
                                                        ContentCode: ""
                                                    }]
                                                })
                                            },
                                            children: "Add Element"
                                        }), Object(U.jsx)("button", {
                                            className: he.a.btnDelElement,
                                            disabled: t.OUT.length < 2,
                                            onClick: function (e) {
                                                e.preventDefault(), s(l)
                                            },
                                            children: "Delete Element"
                                        })]
                                    }), Object(U.jsx)(E.c, {
                                        name: "OUT[".concat(l, "].Element"),
                                        children: function (e) {
                                            var c = e.push, s = e.remove, m = e.replace;
                                            return Object(U.jsxs)("div", {
                                                className: he.a.divElement,
                                                children: [Object(U.jsx)("p", {
                                                    className: he.a.elementTitle,
                                                    children: "Element".concat(l + 1)
                                                }), t.OUT[l].Element.map((function (e, d) {
                                                    return Object(U.jsx)(ge, {
                                                        name: "OUT[".concat(l, "].Element"),
                                                        values: t.OUT[l].Element,
                                                        indexElement: l,
                                                        push: c,
                                                        remove: s,
                                                        replace: m,
                                                        id: e,
                                                        placeholders: n,
                                                        arrayOfGroup: r,
                                                        names: o,
                                                        texts: i,
                                                        setArrayOfG: a,
                                                        indexGroupEl: d
                                                    }, e)
                                                }))]
                                            })
                                        }
                                    })]
                                })
                            }))
                        })
                    }
                })
            })
        }, je = i.a.memo(Ae), Oe = function (e) {
            var t = e.names, r = e.texts, o = e.indexGroupEl, i = e.values, a = e.push, n = e.remove, c = e.name,
                s = e.placeholders;
            return Object(U.jsx)(U.Fragment, {
                children: Object(U.jsxs)("div", {
                    className: he.a.infoblockGroupSIDetails,
                    children: [t.map((function (e, t) {
                        return Object(U.jsxs)("div", {
                            className: he.a.inputWrapSIDetail,
                            children: [Object(U.jsxs)("label", {
                                htmlFor: "".concat(c, "[").concat(o, "]"),
                                children: [r[t], Object(U.jsx)(E.a, {
                                    name: "".concat(c, "[").concat(o, "]"),
                                    component: H
                                })]
                            }), Object(U.jsx)(E.b, {
                                className: he.a.infoblockDivSIDetails,
                                type: "text",
                                placeholder: s[t],
                                name: "".concat(c, "[").concat(o, "]")
                            })]
                        })
                    })), Object(U.jsxs)("div", {
                        className: he.a.btnBlock,
                        children: [Object(U.jsx)("button", {
                            className: he.a.btnAddBlock, onClick: function (e) {
                                e.preventDefault(), a("")
                            }, children: "Add Details"
                        }), Object(U.jsx)("button", {
                            className: he.a.btnDelBlock,
                            disabled: i.length < 2,
                            onClick: function (e) {
                                e.preventDefault(), n(o)
                            },
                            children: "Delete Details"
                        })]
                    })]
                })
            })
        }, Te = i.a.memo(Oe);

        function xe() {
            return Object(U.jsxs)("div", {
                className: ne.a.validate,
                children: ["UCM ", Object(U.jsx)("br", {}), "KL863/KL863/14.HCYDG.DXB", Object(U.jsx)("br", {}), "IN", Object(U.jsx)("br", {}), ".AKE12342.AKE12354.AKE12866.AKE12378.AKE12381JL", Object(U.jsx)("br", {}), ".PMC19991KL", Object(U.jsx)("br", {}), ".PAJ25667KL", Object(U.jsx)("br", {}), "OUT", Object(U.jsx)("br", {}), ".AKE14007KL/KHI/B.AKE11302KL/KHI/C.AKE84103LH/BKK/C", Object(U.jsx)("br", {}), ".AKE19834KL/XXX/X", Object(U.jsx)("br", {}), ".AAP86147SA/XXX/X", Object(U.jsx)("br", {}), ".PAG98611AC/XXX/X", Object(U.jsx)("br", {}), "SI AKE19834KL HAS DAMAGED SIDE PANEL"]
            })
        }

        function Se(e) {
            var t = e.validate, r = e.CurValidatioMessage, o = e.createValidationMessageUCM, i = e.values,
                a = e.arrayForValidationUCM, n = e.setCurValidatioMessage, c = e.selectFSUValue, s = e.setValidate;
            return Object(U.jsxs)("div", {
                className: ne.a.validateMessage,
                children: [!1 === t ? Object(U.jsx)(xe, {}) : Object(U.jsx)("div", {
                    className: ne.a.validate,
                    children: r
                }), !1 === t ? Object(U.jsx)("button", {
                    className: ne.a.message, onClick: function (e) {
                        e.preventDefault(), o(i, a, n, c), s(!0)
                    }, children: "Validate message"
                }) : Object(U.jsxs)("button", {
                    className: ne.a.message, onClick: function (e) {
                        e.preventDefault(), s(!1)
                    }, children: ["Show example", " "]
                })]
            })
        }

        var Ne = r(386),
            Me = ["UCM", "CarrierCode", "FlightNumberFirst", "/", "FlightNumberSecond", "/", "DayOfMonth", ".", "AircraftRegistration", ".", "AirportCodeMovement", "br", "IN", "OUT", "SI", "SIDetail", "br"],
            ye = function (e, t, r) {
                var o = "UCM \n";
                t.forEach((function (t, r) {
                    if (e[t] || "/" === t || "." === t || "br" === t) switch (t) {
                        case"br":
                            o += "\n";
                            break;
                        case"/":
                        case".":
                            o += t.toUpperCase();
                            break;
                        case"IN":
                            o += "IN\n", e[t].forEach((function (e) {
                                e.Element.length && e.Element.forEach((function (e) {
                                    for (var t in e) e[t] && (o += "." + e[t].toUpperCase())
                                })), o += "\n"
                            }));
                            break;
                        case"OUT":
                            o += "OUT\n", e[t].forEach((function (e) {
                                e.Element.length && e.Element.forEach((function (e) {
                                    for (var t in e) "ULDOwnerCode" === t || "AirportCodeofUnloading" === t ? o += "/" + e[t].toUpperCase() : e[t] || "ContentCode" !== t ? o += "." + e[t].toUpperCase() : o += e[t].toUpperCase()
                                })), o += "\n"
                            }));
                            break;
                        case"SIDetail":
                            e[t].forEach((function (e) {
                                o += "SI ".concat(e, " \n")
                            }));
                            break;
                        default:
                            o += e[t].toUpperCase()
                    }
                })), r(o)
            };
        var We = r(384), Pe = r(380), Re = r(381), Ee = Object(M.a)((function (e) {
            return {
                btn: {
                    fontFamily: "'MuseoSansCyrl', serif",
                    fontWeight: "700",
                    maxWidth: "100%",
                    color: "rgb(72, 72, 72)",
                    textDecoration: "none",
                    "&:visited": {textDecoration: "none"}
                },
                container: {
                    display: "flex",
                    justifyContent: "center",
                    maxWidth: "600px",
                    minWidth: "300px",
                    height: "100%",
                    padding: "20px",
                    borderRadius: "10px",
                    boxShadow: "0px 0px 3px 0px #333"
                },
                text: {fontWeight: 900}
            }
        }));
        var _e = [{
            path: "/messages", Component: function () {
                var e = Object(c.g)(), t = Ee(), r = [Object(U.jsx)(F.a, {
                    className: t.btn,
                    size: "large",
                    variant: "outlined",
                    onClick: function () {
                        e.push("/messages/FSU")
                    },
                    children: "FSU messages"
                }, "FSU"), Object(U.jsx)(F.a, {
                    className: t.btn,
                    size: "large",
                    variant: "outlined",
                    onClick: function () {
                        e.push("/messages/UCM")
                    },
                    children: "UCM messages"
                }, "FSU"), Object(U.jsx)(F.a, {
                    className: t.btn,
                    size: "large",
                    variant: "outlined",
                    onClick: function () {
                        e.push("/messages/FFM")
                    },
                    children: "FFM messages"
                }, "FSU")];
                return Object(U.jsx)(w.a, {
                    className: t.container,
                    children: Object(U.jsxs)(We.a, {
                        fullWidth: !0,
                        sx: {
                            maxWidth: "100%",
                            height: "100%",
                            display: "flex",
                            justifyContent: "center",
                            flexDirection: "column",
                            "& > *": {m: 1}
                        },
                        children: [Object(U.jsx)(Pe.a, {
                            className: t.text,
                            variant: "h6",
                            component: "h1",
                            children: "Select type of message to generate and send"
                        }), Object(U.jsx)(Re.a, {
                            sx: {
                                maxWidth: "100%",
                                minWidth: "300px",
                                display: "flex",
                                justifyContent: "center"
                            },
                            orientation: "vertical",
                            "aria-label": "vertical contained button group",
                            variant: "contained",
                            children: r
                        })]
                    })
                })
            }
        }, {
            path: "/messages/fsu", Component: function () {
                var e = Object(o.useState)("StatusCode"), t = Object(N.a)(e, 2), r = t[0], a = t[1],
                    n = Object(o.useState)(""), c = Object(N.a)(n, 2), s = c[0], d = c[1], u = Object(o.useState)(!1),
                    f = Object(N.a)(u, 2), h = f[0], p = f[1], C = Object(o.useState)({}), b = Object(N.a)(C, 2),
                    D = b[0], v = b[1], g = Object(o.useState)([1, 2]), A = Object(N.a)(g, 2), j = A[0], O = A[1],
                    T = ["ARR", "AWD", "AWR", "BKD", "CCD", "CRC", "DDL", "DEP", "DIS", "DLV", "FOH", "MAN", "NFD", "PRE", "RCF", "RCS", "RCT", "TFD", "TGC", "TRM"],
                    x = i.a.useState(!1), S = Object(N.a)(x, 2), M = S[0], y = S[1], W = i.a.useState(""),
                    P = Object(N.a)(W, 2), R = P[0], k = P[1];

                function F() {
                    y(!0)
                }

                Object(o.useEffect)((function () {
                    return function (e, t, r) {
                        for (var o = {}, i = Object.keys(t[e]), a = 0; a < i.length; a++) r[i[a]] && (o[i[a]] = r[i[a]]), v(o)
                    }(r, q, Z)
                }), [r]), Object(o.useEffect)((function () {
                    "FSU15" === r && "StatusCode" === r || O(ee[r])
                }), [r]);
                var I = _.b().shape(D);

                function L(e, t, r, o) {
                    var i = "FSU/15 \n";
                    t.forEach((function (r, a) {
                        if (e[r] || "StatusCode" === r || "/" === r || "-" === r) switch (r) {
                            default:
                                i += e[r].toUpperCase();
                                break;
                            case"StatusCode":
                                i += "\n" + o;
                                break;
                            case"TransmissionChannel":
                            case"/":
                                (e[t[a - 1]] || "StatusCode" === t[a - 1]) && (i += r);
                                break;
                            case"-":
                                e[t[a + 1]] && (i += r)
                        }
                    })), r(i)
                }

                var w = q[r];
                return Object(U.jsxs)(U.Fragment, {
                    children: [Object(U.jsx)(ie, {text: R, modalIsOpen: M, setIsOpen: y}), Object(U.jsx)(E.e, {
                        enableReinitialize: !0,
                        initialValues: w,
                        validateOnBlur: !0,
                        validationSchema: I,
                        onSubmit: function (e, t) {
                            var o = t.setSubmitting, i = t.resetForm;
                            e.StatusCode = r;
                            for (var n = 0, c = {}, s = 0, d = Object.entries(e); s < d.length; s++) {
                                var u = Object(N.a)(d[s], 2), f = u[0], h = u[1];
                                c[f] = h.toUpperCase()
                            }
                            "FSU15" !== r && "StatusCode" !== r ? function e() {
                                setTimeout(Object(m.a)(l.a.mark((function t() {
                                    var s;
                                    return l.a.wrap((function (t) {
                                        for (; ;) switch (t.prev = t.next) {
                                            case 0:
                                                return t.prev = 0, t.next = 3, le.FSUmessage(c, r);
                                            case 3:
                                                "200 OK (Message sending successfully)" === (s = t.sent).data.status ? (i(), k("Message was sent successfully. Message ID = ".concat(s.data.msggid)), F(), o(!1), a("FSU15")) : (k(s.data.errors), F()), t.next = 10;
                                                break;
                                            case 7:
                                                t.prev = 7, t.t0 = t.catch(0), 5 === n ? (k("".concat(t.t0)), F()) : (n++, e());
                                            case 10:
                                            case"end":
                                                return t.stop()
                                        }
                                    }), t, null, [[0, 7]])
                                }))), 2e3)
                            }() : (k("Status code is not selected"), F())
                        },
                        children: function (e) {
                            var t = e.values, o = (e.errors, e.touched, e.isValid), i = e.dirty;
                            return Object(U.jsx)(U.Fragment, {
                                children: Object(U.jsxs)(E.d, {
                                    className: B.a.form,
                                    children: [Object(U.jsxs)("div", {
                                        className: B.a.fsublock,
                                        children: [Object(U.jsxs)("div", {
                                            className: B.a.fsu,
                                            children: [Object(U.jsx)("h4", {
                                                className: B.a.fsuh4,
                                                children: "Status code FSU"
                                            }), Object(U.jsxs)("select", {
                                                value: r,
                                                onChange: function (e) {
                                                    a(e.target.value)
                                                },
                                                name: "selectFSU",
                                                className: B.a.fsublockoption,
                                                id: "fsu",
                                                children: [Object(U.jsx)("option", {
                                                    value: "FSU15",
                                                    children: "StatusCode"
                                                }, "FSU15"), T.map((function (e) {
                                                    return Object(U.jsx)("option", {value: e, children: e}, e)
                                                }))]
                                            })]
                                        }), Object(U.jsx)("h4", {
                                            className: B.a.fsuh4,
                                            children: "Type of transmission channel"
                                        }), Object(U.jsx)(J, {
                                            name: "TransmissionChannel",
                                            styles: B.a,
                                            className: B.a.fsublockoption,
                                            arrOfValue: ["TransmissionChannel", "Email", "SITA", "Edifly"]
                                        })]
                                    }), Object(U.jsxs)("div", {
                                        className: B.a.formDiv,
                                        children: [Object(U.jsx)("h4", {
                                            className: B.a.awb,
                                            children: "AWB Indefication"
                                        }), Object(U.jsxs)("div", {
                                            className: B.a.infoblock,
                                            children: [Object(U.jsx)(Q, {
                                                name: "AirLinePrefix",
                                                text: "AirLine Prefix",
                                                placeholder: "AirLinePrefix",
                                                classname: "inputWrap"
                                            }), Object(U.jsx)(Q, {
                                                name: "SerialNumber",
                                                text: "Serial Number",
                                                placeholder: "SerialNumber",
                                                classname: "inputWrap"
                                            }), Object(U.jsx)(Q, {
                                                name: "AirportCodeofOrigin",
                                                text: "Airport code of Origin",
                                                placeholder: "AirportCodeofOrigin",
                                                classname: "inputWrap"
                                            }), Object(U.jsx)(Q, {
                                                name: "AirportCodeofDestination",
                                                text: "Airport code of Destination",
                                                placeholder: "AirportCodeofDestination",
                                                classname: "inputWrap"
                                            })]
                                        }), Object(U.jsx)("h4", {children: "Quantity Detail"}), Object(U.jsxs)("div", {
                                            className: B.a.infoblockQuantity,
                                            children: [Object(U.jsxs)("div", {
                                                className: B.a.infoblockQuantityDetail,
                                                children: [Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    name: "ShipmentDescriptionCode",
                                                    text: "Shipment Description Code",
                                                    arrOfValue: ["ShipmentDescriptionCode", "P", "T"]
                                                }), Object(U.jsx)(Q, {
                                                    name: "NumberofPieces",
                                                    text: "Number of Pieces",
                                                    placeholder: "NumberofPieces",
                                                    classname: "inputWrap"
                                                }), Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    name: "WeightCode",
                                                    text: "Weight Code",
                                                    arrOfValue: ["WeightCode", "K", "L"]
                                                }), Object(U.jsx)(Q, {
                                                    name: "Weight",
                                                    text: "Weight",
                                                    placeholder: "Weight",
                                                    classname: "inputWrap"
                                                })]
                                            }), Object(U.jsxs)("div", {
                                                className: B.a.infoblockQuantityDetail,
                                                children: [Object(U.jsx)("h4", {children: "Total Consignment Places"}), Object(U.jsxs)("div", {
                                                    className: B.a.infoblockQuantityDetail,
                                                    children: [Object(U.jsx)(Y, {
                                                        type: "text",
                                                        className: B.a.infoblockDiv,
                                                        name: "TotalShipmentDescriptionCode",
                                                        text: "Total Shipment Description Code"
                                                    }), Object(U.jsx)(Q, {
                                                        disabled: "P" !== t.ShipmentDescriptionCode,
                                                        name: "TotalNumberofPieces",
                                                        text: "Total Number of Pieces",
                                                        placeholder: "TotalNumberofPieces",
                                                        classname: "inputWrap"
                                                    })]
                                                })]
                                            })]
                                        }), "CRC" === r ? Object(U.jsxs)(U.Fragment, {
                                            children: [Object(U.jsx)("h4", {children: "Reporting Detail"}), Object(U.jsxs)("div", {
                                                className: B.a.infoblock,
                                                children: ["CRC" === r ? Object(U.jsx)(J, {
                                                    name: "DayofReporting",
                                                    text: "Day of Reporting",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["DayofReporting"].concat(Object(z.a)(me))
                                                }) : null, "CRC" === r ? Object(U.jsx)(J, {
                                                    name: "MonthofReporting",
                                                    text: "Month of Reporting",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["MonthofReporting"].concat(Object(z.a)(ue))
                                                }) : null, "CRC" === r ? Object(U.jsx)(Q, {
                                                    name: "ActualTimeofGivenStatusEvent",
                                                    text: "Actual Time of Given Status Event",
                                                    placeholder: "ActualTimeofGivenStatusEvent",
                                                    classname: "inputWrap"
                                                }) : null, "CRC" === r ? Object(U.jsx)(Q, {
                                                    name: "AirportCodeofReporting",
                                                    text: "Airport Code of Reporting",
                                                    placeholder: "AirportCodeofReporting",
                                                    classname: "inputWrap"
                                                }) : null]
                                            })]
                                        }) : null, "ARR" === r || "AWR" === r || "NFD" === r || "MAN" === r || "FOH" === r || "PRE" === r || "DEP" === r || "AWD" === r || "TFD" === r || "RCS" === r || "RCF" === r || "RCT" === r || "BKD" === r || "CCD" === r || "DDL" === r || "CRC" === r || "DIS" === r || "DLV" === r || "TGC" === r || "TRM" === r ? Object(U.jsxs)(U.Fragment, {
                                            children: [Object(U.jsx)("h4", {children: "Movement Detail"}), Object(U.jsxs)("div", {
                                                className: B.a.infoblock,
                                                children: ["CCD" === r ? Object(U.jsx)(J, {
                                                    name: "DayofClearance",
                                                    text: "Day of Clearance",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["DayofClearance"].concat(Object(z.a)(me))
                                                }) : null, "CCD" === r ? Object(U.jsx)(J, {
                                                    name: "MonthofClearance",
                                                    text: "Month of Clearance",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["MonthofClearance"].concat(Object(z.a)(ue))
                                                }) : null, "DDL" === r ? Object(U.jsx)(J, {
                                                    name: "DayofDeliverytoconsigneesdoor",
                                                    text: "Day of Delivery to consignee\u2019s door",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["DayofDeliverytoconsigneesdoor"].concat(Object(z.a)(me))
                                                }) : null, "DDL" === r ? Object(U.jsx)(J, {
                                                    name: "MonthofDeliverytoconsigneesdoor",
                                                    text: "Month of Delivery to consignee\u2019s door",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["MonthofDeliverytoconsigneesdoor"].concat(Object(z.a)(ue))
                                                }) : null, "AWD" === r || "DLV" === r ? Object(U.jsx)(J, {
                                                    name: "DayofDelivery",
                                                    text: "Day of Delivery",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["DayofDelivery"].concat(Object(z.a)(me))
                                                }) : null, "AWD" === r || "DLV" === r ? Object(U.jsx)(J, {
                                                    name: "MonthofDelivery",
                                                    text: "Month of Delivery",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["MonthofDelivery"].concat(Object(z.a)(ue))
                                                }) : null, "DLV" === r ? Object(U.jsx)(Q, {
                                                    name: "AirportCodeofDelivery",
                                                    text: "Airport Code of Delivery",
                                                    placeholder: "AirportCodeofDelivery",
                                                    classname: "inputWrap"
                                                }) : null, "DDL" === r ? Object(U.jsx)(Q, {
                                                    name: "AirportCodeofDeliverytoconsigneesdoor",
                                                    text: "Airport Code of Delivery to consignee\u2019s door",
                                                    placeholder: "AirportCodeofDeliverytoconsigneesdoor",
                                                    classname: "inputWrap"
                                                }) : null, "ARR" === r || "MAN" === r || "PRE" === r || "DEP" === r || "AWR" === r || "RCT" === r || "RCF" === r || "TFD" === r || "TRM" === r || "BKD" === r || "CRC" === r || "DIS" === r ? Object(U.jsx)(Q, {
                                                    name: "CarrierCode",
                                                    text: "Carrier Code",
                                                    placeholder: "CarrierCode",
                                                    classname: "inputWrap"
                                                }) : null, "TGC" === r || "RCT" === r || "TFD" === r ? Object(U.jsx)(J, {
                                                    name: "DayofTransfer",
                                                    text: "Day of Transfer",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["DayofTransfer"].concat(Object(z.a)(me))
                                                }) : null, "RCS" === r || "FOH" === r ? Object(U.jsx)(J, {
                                                    name: "DayofReceipt",
                                                    text: "Day of Receipt",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["DayofReceipt"].concat(Object(z.a)(me))
                                                }) : null, "NFD" === r ? Object(U.jsx)(J, {
                                                    name: "DayofNotification",
                                                    text: "Day of Nofication",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["DayofNotification"].concat(Object(z.a)(me))
                                                }) : null, "TGC" === r || "RCT" === r || "TFD" === r ? Object(U.jsx)(J, {
                                                    name: "MonthofTransfer",
                                                    text: "Month of Transfer",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["MonthofTransfer"].concat(Object(z.a)(ue))
                                                }) : null, "RCS" === r || "FOH" === r ? Object(U.jsx)(J, {
                                                    name: "MonthofReceipt",
                                                    text: "Month of Receipt",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["DayofReceipt"].concat(Object(z.a)(ue))
                                                }) : null, "NFD" === r ? Object(U.jsx)(J, {
                                                    name: "MonthofNotification",
                                                    text: "Month of Notification",
                                                    className: B.a.infoblockDiv,
                                                    arrOfValue: ["MonthofNotification"].concat(Object(z.a)(ue))
                                                }) : null, "AWD" === r || "FOH" === r || "CCD" === r || "NFD" === r || "RCS" === r || "RCT" === r || "DDL" === r || "DLV" === r || "TGC" === r || "TFD" === r ? Object(U.jsx)(Q, {
                                                    name: "ActualTimeofGivenStatusEvent",
                                                    text: "Actual Time of Given Status Event",
                                                    placeholder: "ActualTimeofGivenStatusEvent",
                                                    classname: "inputWrap"
                                                }) : null, "CCD" === r ? Object(U.jsx)(Q, {
                                                    name: "AirportCodeofClearance",
                                                    text: "Airport Code of Clearance",
                                                    placeholder: "AirportCodeofClearance",
                                                    classname: "inputWrap"
                                                }) : null, "TRM" === r || "RCT" === r || "TFD" === r || "TGC" === r ? Object(U.jsx)(Q, {
                                                    name: "AirportCodeofTransfer",
                                                    text: "Airport Code of Transfer",
                                                    placeholder: "AirportCodeofTransfer",
                                                    classname: "inputWrap"
                                                }) : null, "RCS" === r || "FOH" === r ? Object(U.jsx)(Q, {
                                                    name: "MovementAirportCodeofReceipt",
                                                    text: "Airport Code of Receipt",
                                                    placeholder: "MovementAirportCodeofReceipt",
                                                    classname: "inputWrap"
                                                }) : null, "ARR" === r || "RCF" === r || "MAN" === r || "DEP" === r || "AWR" === r || "PRE" === r || "BKD" === r || "CRC" === r || "DIS" === r ? Object(U.jsx)(Q, {
                                                    name: "FlightNumber",
                                                    text: "Flight Number",
                                                    placeholder: "FlightNumber",
                                                    classname: "inputWrap"
                                                }) : null, "DIS" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    text: "Day of Discrepancy",
                                                    name: "DayofDiscrepancy",
                                                    arrOfValue: ["MonthofDiscrepancy"].concat(Object(z.a)(me))
                                                }) : null, "DIS" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    text: "Month of Discrepancy",
                                                    name: "MonthofDiscrepancy",
                                                    arrOfValue: ["MonthofDiscrepancy"].concat(Object(z.a)(ue))
                                                }) : null, "ARR" === r || "RCF" === r || "AWR" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    text: "Day of Scheduled Arrival",
                                                    name: "DayofScheduledArrival",
                                                    arrOfValue: ["DayofScheduledArrival"].concat(Object(z.a)(me))
                                                }) : null, "ARR" === r || "RCF" === r || "AWR" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    text: "Month of Scheduled Arrival",
                                                    name: "MonthofScheduledArrival",
                                                    arrOfValue: ["MonthofScheduledArrival"].concat(Object(z.a)(ue))
                                                }) : null, "DEP" === r || "BKD" === r || "MAN" === r || "PRE" === r || "CRC" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    text: "Day of Scheduled Departure",
                                                    name: "DayofScheduledDeparture",
                                                    arrOfValue: ["DayofScheduledDeparture"].concat(Object(z.a)(me))
                                                }) : null, "DEP" === r || "BKD" === r || "MAN" === r || "PRE" === r || "CRC" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    text: "Month of Scheduled Departure",
                                                    name: "MonthofScheduledDeparture",
                                                    arrOfValue: ["MonthofScheduledArrival"].concat(Object(z.a)(ue))
                                                }) : null, "ARR" === r || "AWR" === r || "DIS" === r || "RCF" === r ? Object(U.jsx)(Q, {
                                                    name: "ActualTimeofGivenStatusEvent",
                                                    text: "Actual Time of Given Status Event",
                                                    placeholder: "ActualTimeofGivenStatusEvent",
                                                    classname: "inputWrap"
                                                }) : null, "RCF" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    name: "DayChangeIndicatorArrival",
                                                    text: "Day Change Indicator Arrival",
                                                    arrOfValue: ["DayChangeIndicatorArrival"].concat(Object(z.a)(de))
                                                }) : null, "ARR" === r || "AWR" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    text: "Day Change Indicator Movement",
                                                    name: "DayChangeIndicatorMovement",
                                                    arrOfValue: ["DayChangeIndicatorMovement"].concat(Object(z.a)(de))
                                                }) : null, "DIS" === r ? Object(U.jsx)(Q, {
                                                    name: "AirportCodeofDiscrepancy",
                                                    text: "Airport Code of Discrepancy",
                                                    placeholder: "AirportCodeofDiscrepancy",
                                                    classname: "inputWrap"
                                                }) : null, "DIS" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    name: "DiscrepancyCode",
                                                    text: "Discrepancy Code",
                                                    arrOfValue: ["DiscrepancyCode", "FDAW", "FDCA", "MSAW", "MSCA", "FDAV", "FDMB", "MSAV", "MSMB", "DFLD", "OFLD", "OVCD", "SSPD"]
                                                }) : null, "AWD" === r ? Object(U.jsx)(Q, {
                                                    name: "AirportCodeofDelivery",
                                                    text: "Airport Code of Delivery",
                                                    placeholder: "AirportCodeofDelivery",
                                                    classname: "inputWrap"
                                                }) : null, "DEP" === r || "MAN" === r || "PRE" === r || "BKD" === r || "CRC" === r ? Object(U.jsx)(Q, {
                                                    name: "AirportCodeofDeparture",
                                                    text: "Airport Code of Departure",
                                                    placeholder: "AirportCodeofDeparture",
                                                    classname: "inputWrap"
                                                }) : null, "NFD" === r ? Object(U.jsx)(Q, {
                                                    name: "AirportCodeofNotification",
                                                    text: "Airport Code of Notification",
                                                    placeholder: "AirportCodeofNotification",
                                                    classname: "inputWrap"
                                                }) : null, "ARR" === r || "MAN" === r || "PRE" === r || "DEP" === r || "AWR" === r || "RCF" === r || "BKD" === r || "CRC" === r ? Object(U.jsx)(Q, {
                                                    name: "AirportCodeofArrival",
                                                    text: "Airport Code of Arrival",
                                                    placeholder: "AirportCodeofArrival",
                                                    classname: "inputWrap"
                                                }) : null, "ARR" === r || "MAN" === r || "FOH" === r || "NFD" === r || "DEP" === r || "AWD" === r || "AWR" === r || "BKD" === r || "CCD" === r || "DDL" === r || "CRC" === r || "DIS" === r || "DLV" === r || "TGC" === r || "PRE" === r || "TRM" === r || "TFD" === r || "RCF" === r || "RCT" === r || "RCS" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    name: "MovementShipmentDescriptionCode",
                                                    text: "Shipment Description Code",
                                                    arrOfValue: ["ShipmentDescriptionCode", "T", "P"]
                                                }) : null, "ARR" === r || "MAN" === r || "FOH" === r || "NFD" === r || "DEP" === r || "AWD" === r || "AWR" === r || "BKD" === r || "CCD" === r || "DDL" === r || "CRC" === r || "DIS" === r || "DLV" === r || "TGC" === r || "PRE" === r || "TRM" === r || "TFD" === r || "RCF" === r || "RCT" === r || "RCS" === r ? Object(U.jsx)(Q, {
                                                    name: "MovementNumberofPieces",
                                                    text: "Number of Pieces",
                                                    placeholder: "MovementNumberofPieces",
                                                    classname: "inputWrap"
                                                }) : null, "ARR" === r || "MAN" === r || "FOH" === r || "NFD" === r || "DEP" === r || "AWD" === r || "AWR" === r || "BKD" === r || "CCD" === r || "DDL" === r || "CRC" === r || "DIS" === r || "DLV" === r || "TGC" === r || "PRE" === r || "TRM" === r || "TFD" === r || "RCF" === r || "RCT" === r || "RCS" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    name: "MovementWeightCode",
                                                    text: "Weight Code",
                                                    arrOfValue: ["MovementWeightCode", "K", "L"]
                                                }) : null, "ARR" === r || "NFD" === r || "MAN" === r || "FOH" === r || "PRE" === r || "DEP" === r || "AWD" === r || "AWR" === r || "BKD" === r || "CCD" === r || "DDL" === r || "CRC" === r || "DIS" === r || "DLV" === r || "TGC" === r || "TRM" === r || "TFD" === r || "RCF" === r || "RCT" === r || "RCS" === r ? Object(U.jsx)(Q, {
                                                    name: "MovementWeight",
                                                    text: "Weight",
                                                    placeholder: "MovementWeight",
                                                    classname: "inputWrap"
                                                }) : null, "RCS" === r ? Object(U.jsx)(Q, {
                                                    name: "ReceivedFromDetail",
                                                    text: "Received From Detail",
                                                    placeholder: "ReceivedFromDetail",
                                                    classname: "inputWrapReceived"
                                                }) : null]
                                            })]
                                        }) : null, "ARR" === r || "DEP" === r || "MAN" === r || "AWR" === r || "PRE" === r || "BKD" === r ? Object(U.jsxs)(U.Fragment, {
                                            children: [Object(U.jsx)("h4", {children: "Time of Departure Information"}), Object(U.jsxs)("div", {
                                                className: B.a.infoblock,
                                                children: ["ARR" === r || "DEP" === r || "MAN" === r || "PRE" === r || "AWR" === r || "BKD" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    name: "TypeofTimeIndicatorDeparture",
                                                    text: "Type Of Time Indicator Departure",
                                                    arrOfValue: ["TypeofTimeIndicatorDeparture", "A", "E", "S"]
                                                }) : null, "ARR" === r || "MAN" === r || "DEP" === r || "PRE" === r || "AWR" === r || "BKD" === r ? Object(U.jsx)(Q, {
                                                    name: "TimeDeparture",
                                                    text: "Time Departuve",
                                                    placeholder: "TimeDeparture"
                                                }) : null, "ARR" === r || "MAN" === r || "DEP" === r || "PRE" === r || "AWR" === r || "BKD" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    name: "DayChangeIndicatorDeparture",
                                                    text: "Day Change Indicator Departure",
                                                    arrOfValue: ["DayChangeIndicatorDeparture"].concat(Object(z.a)(de))
                                                }) : null]
                                            })]
                                        }) : null, "ARR" === r || "DEP" === r || "PRE" === r || "AWR" === r || "MAN" === r || "BKD" === r ? Object(U.jsxs)(U.Fragment, {
                                            children: [Object(U.jsx)("h4", {children: "Time of Arrival Information"}), Object(U.jsxs)("div", {
                                                className: B.a.infoblock,
                                                children: ["ARR" === r || "MAN" === r || "DEP" === r || "PRE" === r || "AWR" === r || "BKD" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    name: "TypeofTimeIndicatorArrival",
                                                    text: "Type Of Time Indicator Arrival",
                                                    arrOfValue: ["TypeOfTimeIndicatorArrival", "A", "E", "S"]
                                                }) : null, "ARR" === r || "MAN" === r || "DEP" === r || "PRE" === r || "AWR" === r || "BKD" === r ? Object(U.jsx)(Q, {
                                                    name: "TimeArrival",
                                                    text: "Time Arrival",
                                                    placeholder: "TimeArrival",
                                                    classname: "inputWrap"
                                                }) : null, "ARR" === r || "MAN" === r || "DEP" === r || "PRE" === r || "AWR" === r || "BKD" === r || "RCF" === r ? Object(U.jsx)(J, {
                                                    className: B.a.infoblockDiv,
                                                    name: "DayChangeIndicatorArrival",
                                                    text: "Day Change Indicator Arrival",
                                                    arrOfValue: ["DayChangeIndicatorArrival"].concat(Object(z.a)(de))
                                                }) : null]
                                            })]
                                        }) : null, Object(U.jsx)(se, {
                                            validate: h,
                                            values: t,
                                            CurValidatioMessage: s,
                                            createValidationMessage: L,
                                            curFSUSchema: j,
                                            setCurValidatioMessage: d,
                                            selectFSUValue: r,
                                            setValidate: p
                                        }), Object(U.jsx)("div", {
                                            className: B.a.publish,
                                            children: Object(U.jsx)("button", {
                                                className: B.a.message,
                                                disabled: !o && !i,
                                                children: "Publish"
                                            })
                                        })]
                                    })]
                                })
                            })
                        }
                    })]
                })
            }
        }, {
            path: "/messages/ucm", Component: function () {
                var e = i.a.useState(""), t = Object(N.a)(e, 2), r = t[0], a = t[1], n = i.a.useState(!1),
                    c = Object(N.a)(n, 2), s = c[0], d = c[1], u = Object(o.useState)(!1), f = Object(N.a)(u, 2),
                    h = f[0], p = f[1], C = Object(o.useState)(""), b = Object(N.a)(C, 2), D = b[0], v = b[1],
                    g = Object(o.useState)([Object(Ne.a)()]), A = Object(N.a)(g, 2), j = A[0], O = A[1];

                function T() {
                    d(!0)
                }

                var x = function () {
                        var e = Object(m.a)(l.a.mark((function e(t, r) {
                            var o, i, n;
                            return l.a.wrap((function (e) {
                                for (; ;) switch (e.prev = e.next) {
                                    case 0:
                                        return o = r.setSubmitting, i = r.resetForm, e.next = 3, le.UCMmessage(t);
                                    case 3:
                                        "200 OK (Message sending successfully)" === (n = e.sent).data.status ? (i(), a("Message was sent successfully. Message ID = ".concat(n.data.msggid)), T(), o(!1)) : (a(n.data.errors), T());
                                    case 5:
                                    case"end":
                                        return e.stop()
                                }
                            }), e)
                        })));
                        return function (t, r) {
                            return e.apply(this, arguments)
                        }
                    }(), S = _.b().shape(K), M = ["ULD Type", "ULD Serial Number", "ULD Owner Code"],
                    y = ["ULDIATACode", "ULDSerialNumber", "ULDOwnerCode"],
                    W = ["ULDIATACode", "ULDSerialNumber", "ULDOwnerCode"],
                    P = ["ULD Type", "ULD Serial Number", "ULD Owner Code", "Airport Code of Unloading", "Content Code"],
                    R = ["ULDIATACode", "ULDSerialNumber", "ULDOwnerCode", "AirportCodeofUnloading", "ContentCode"],
                    k = ["ULDIATACode", "ULDSerialNumber", "ULDOwnerCode", "AirportCodeofUnloading", "ContentCode"],
                    F = ["SI Details"], I = ["SIDetail"], L = ["SI Details"];
                return Object(U.jsxs)(U.Fragment, {
                    children: [Object(U.jsx)(ie, {text: r, modalIsOpen: s, setIsOpen: d}), Object(U.jsx)(E.e, {
                        enableReinitialize: !0,
                        initialValues: {
                            TransmissionChannel: "",
                            DeletedULD: !1,
                            CarrierCode: "",
                            FlightNumberFirst: "",
                            FlightNumberSecond: "",
                            DayOfMonth: "",
                            AircraftRegistration: "",
                            AirportCode: "",
                            IN: [{Element: [{ULDIATACode: "", ULDSerialNumber: "", ULDOwnerCode: ""}]}],
                            OUT: [{
                                Element: [{
                                    ULDIATACode: "",
                                    ULDSerialNumber: "",
                                    ULDOwnerCode: "",
                                    AirportCodeofUnloading: "",
                                    ContentCode: ""
                                }]
                            }],
                            SIDetail: [""]
                        },
                        validateOnBlur: !0,
                        validationSchema: S,
                        onSubmit: x,
                        children: function (e) {
                            var t = e.values, r = (e.errors, e.touched, e.isValid), o = e.dirty;
                            e.push;
                            return Object(U.jsxs)(E.d, {
                                className: he.a.form,
                                children: [Object(U.jsxs)("div", {
                                    className: he.a.fsublock,
                                    children: [Object(U.jsx)("h4", {
                                        className: he.a.fsuh4,
                                        children: "Type of transmission channel"
                                    }), Object(U.jsx)(J, {
                                        name: "TransmissionChannel",
                                        styles: he.a,
                                        className: he.a.infoblockDiv,
                                        arrOfValue: ["TransmissionChannel", "Email", "SITA", "Edifly"]
                                    })]
                                }), Object(U.jsxs)("div", {
                                    className: he.a.formDiv,
                                    children: [Object(U.jsx)("h4", {children: "Flight Identification"}), Object(U.jsxs)("div", {
                                        className: he.a.infoblock,
                                        children: [Object(U.jsx)(Q, {
                                            name: "CarrierCode",
                                            text: "Carrier Code",
                                            placeholder: "CarrierCode",
                                            classname: "inputWrap"
                                        }), Object(U.jsx)(Q, {
                                            name: "FlightNumberFirst",
                                            text: "Flight Number(1st)",
                                            placeholder: "1stFlightNumber",
                                            classname: "inputWrap"
                                        }), Object(U.jsx)(Q, {
                                            name: "FlightNumberSecond",
                                            text: "Flight Number(2nd)",
                                            placeholder: "2ndFlightNumber",
                                            classname: "inputWrap"
                                        }), Object(U.jsx)(J, {
                                            name: "DayOfMonth",
                                            text: "Day Of Month",
                                            className: he.a.infoblockDiv,
                                            arrOfValue: ["Day Of Month"].concat(Object(z.a)(me)),
                                            classname: "inputWrap"
                                        }), Object(U.jsx)(Q, {
                                            name: "AircraftRegistration",
                                            text: "Aircraft Registration",
                                            placeholder: "AircraftRegistration",
                                            classname: "inputWrap"
                                        }), Object(U.jsx)(Q, {
                                            name: "AirportCode",
                                            text: "Airport code (of movement)",
                                            placeholder: "AirportCodeofMovement",
                                            classname: "inputWrap"
                                        })]
                                    }), Object(U.jsx)("div", {
                                        className: he.a.sendingInvDiv,
                                        children: Object(U.jsxs)("label", {
                                            className: he.a.sendingInv,
                                            children: [Object(U.jsx)(E.b, {
                                                type: "checkbox",
                                                name: "DeletedULD",
                                                onClick: function () {
                                                    !1 === t.DeletedULD ? e.setValues({
                                                        TransmissionChannel: t.TransmissionChannel,
                                                        DeletedULD: "true",
                                                        CarrierCode: t.CarrierCode,
                                                        FlightNumberFirst: t.FlightNumberFirst,
                                                        FlightNumberSecond: t.FlightNumberSecond,
                                                        DayOfMonth: t.DayOfMonth,
                                                        AircraftRegistration: t.AircraftRegistration,
                                                        AirportCode: t.AirportCode
                                                    }) : e.setValues({
                                                        TransmissionChannel: t.TransmissionChannel,
                                                        DeletedULD: "false",
                                                        CarrierCode: t.CarrierCode,
                                                        FlightNumberFirst: t.FlightNumberFirst,
                                                        FlightNumberSecond: t.FlightNumberSecond,
                                                        DayOfMonth: t.DayOfMonth,
                                                        AircraftRegistration: t.AircraftRegistration,
                                                        AirportCode: t.AirportCode,
                                                        IN: [{
                                                            Element: [{
                                                                ULDIATACode: "",
                                                                ULDSerialNumber: "",
                                                                ULDOwnerCode: ""
                                                            }]
                                                        }],
                                                        OUT: [{
                                                            Element: [{
                                                                ULDIATACode: "",
                                                                ULDSerialNumber: "",
                                                                ULDOwnerCode: "",
                                                                AirportCodeofUnloading: "",
                                                                ContentCode: ""
                                                            }]
                                                        }],
                                                        SIDetail: [""]
                                                    })
                                                }
                                            }), "Sending removed from station's inventory"]
                                        })
                                    }), t.DeletedULD ? null : Object(U.jsxs)(U.Fragment, {
                                        children: [Object(U.jsx)("h4", {children: "Incoming ULD"}), Object(U.jsx)(De, {
                                            values: t,
                                            placeholdersArrForGroup1: W,
                                            namesArrForGroup1: y,
                                            arrayOfGroup: j,
                                            namenamesArrForGroup1s: y,
                                            textsArrForGroup1: M,
                                            setArrayOfGroup: O
                                        }), Object(U.jsx)("h4", {children: "Outgoung ULD"}), Object(U.jsx)(je, {
                                            values: t,
                                            placeholdersArrForGroup1: k,
                                            namesArrForGroup1: R,
                                            arrayOfGroup: j,
                                            textsArrForGroup1: P,
                                            setArrayOfGroup: O
                                        }), Object(U.jsx)("h4", {children: "Supplementary Information"}), Object(U.jsx)(E.c, {
                                            name: "SIDetail",
                                            children: function (e) {
                                                var r = e.push, o = e.remove;
                                                return Object(U.jsx)(U.Fragment, {
                                                    children: Object(U.jsx)("div", {
                                                        className: he.a.infoblock,
                                                        children: t.SIDetail.map((function (e, i) {
                                                            return Object(U.jsxs)("div", {
                                                                className: he.a.divElement,
                                                                children: [Object(U.jsx)("p", {
                                                                    className: he.a.elementTitle,
                                                                    children: "SI Detail".concat(i + 1)
                                                                }), Object(U.jsx)(Te, {
                                                                    name: "SIDetail",
                                                                    values: t.SIDetail,
                                                                    indexElement: i,
                                                                    push: r,
                                                                    remove: o,
                                                                    placeholders: L,
                                                                    names: I,
                                                                    texts: F,
                                                                    setArrayOfG: O,
                                                                    indexGroupEl: i
                                                                }, i)]
                                                            })
                                                        }))
                                                    })
                                                })
                                            }
                                        })]
                                    }), Object(U.jsx)(Se, {
                                        validate: h,
                                        values: t,
                                        CurValidatioMessage: D,
                                        createValidationMessageUCM: ye,
                                        setCurValidatioMessage: v,
                                        setValidate: p,
                                        arrayForValidationUCM: Me
                                    }), Object(U.jsx)("div", {
                                        className: he.a.publish,
                                        children: Object(U.jsx)("button", {
                                            className: he.a.message,
                                            disabled: !r && !o,
                                            children: "Publish"
                                        })
                                    })]
                                })]
                            })
                        }
                    })]
                })
            }
        }], ke = [{
            path: "/", Component: function () {
                var e = V(), t = Object(c.g)(), r = Object(c.h)(), o = i.a.useState(!1), a = Object(N.a)(o, 2),
                    n = a[0], s = a[1], d = function () {
                        s(!1)
                    }, u = ((r.state || {from: {pathname: "/"}}).from, Object(y.b)()), f = Object(E.g)({
                        initialValues: {Login: "", Password: ""}, validationSchema: G, onSubmit: function (e) {
                            var r = Object.entries(e).filter((function (e) {
                                return e[1] ? e[1].trim() : e[1]
                            }));
                            r.length && (r = Object.fromEntries(r), u(function (e, t, r) {
                                return function () {
                                    var r = Object(m.a)(l.a.mark((function r(o) {
                                        var i;
                                        return l.a.wrap((function (r) {
                                            for (; ;) switch (r.prev = r.next) {
                                                case 0:
                                                    return o(T()), r.prev = 1, r.next = 4, p.login(e);
                                                case 4:
                                                    200 !== (i = r.sent).status || i.data.error ? 200 === i.status && i.data.error && (console.log(i), alert("\u041e\u0448\u0438\u0431\u043a\u0430: ".concat(i.data.error))) : (console.log("\u043e\u0442\u0432\u0435\u0442 \u043e\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u0430 \u043f\u0440\u0438 \u0443\u0441\u043f\u0435\u0448\u043d\u043e\u0439 \u0430\u0432\u0442\u043e\u0440\u0438\u0437\u0430\u0446\u0438\u0438 ", i), localStorage.setItem("token", i.data.access_token), o(S()), t.replace("/messages")), 401 !== i.status && 401 !== i.status || alert("\u041d\u0435\u0432\u0435\u0440\u043d\u043e \u0432\u0432\u0435\u0434\u0435\u043d\u044b \u0434\u0430\u043d\u043d\u044b\u0435, \u043f\u043e\u043f\u0440\u043e\u0431\u0443\u0439\u0442\u0435 \u0441\u043d\u043e\u0432\u0430"), r.next = 12;
                                                    break;
                                                case 9:
                                                    r.prev = 9, r.t0 = r.catch(1), console.log(r.t0);
                                                case 12:
                                                    o(x());
                                                case 13:
                                                case"end":
                                                    return r.stop()
                                            }
                                        }), r, null, [[1, 9]])
                                    })));
                                    return function (e) {
                                        return r.apply(this, arguments)
                                    }
                                }()
                            }(r, t)))
                        }
                    });
                return Object(U.jsxs)(w.a, {
                    maxWidth: "xs",
                    children: [Object(U.jsxs)("div", {
                        children: [Object(U.jsx)("h1", {
                            className: e.head,
                            children: "UI Agent"
                        }), Object(U.jsxs)("form", {
                            onSubmit: f.handleSubmit,
                            children: [Object(U.jsx)(k.a, {
                                fullWidth: !0,
                                className: e.root,
                                id: "login",
                                name: "Login",
                                label: "Login",
                                variant: "standard",
                                margin: "normal",
                                size: "normal",
                                value: f.values.Login,
                                onChange: f.handleChange,
                                error: f.touched.Login && Boolean(f.errors.Login),
                                helperText: f.touched.Login && f.errors.Login
                            }), Object(U.jsx)(k.a, {
                                fullWidth: !0,
                                size: "normal",
                                id: "password",
                                name: "Password",
                                label: "Password",
                                variant: "standard",
                                type: "password",
                                margin: "normal",
                                value: f.values.Password,
                                onChange: f.handleChange,
                                error: f.touched.Password && Boolean(f.errors.Password),
                                helperText: f.touched.Password && f.errors.Password
                            }), Object(U.jsx)(F.a, {
                                variant: "contained",
                                fullWidth: !0,
                                type: "submit",
                                children: "Submit"
                            })]
                        }), Object(U.jsx)("br", {})]
                    }), Object(U.jsxs)("div", {
                        children: [Object(U.jsx)(F.a, {
                            variant: "text", onClick: function () {
                                s(!0)
                            }, children: "Create Account"
                        }), Object(U.jsx)(W.a, {
                            "aria-labelledby": "transition-modal-title",
                            "aria-describedby": "transition-modal-description",
                            className: e.modal,
                            open: n,
                            onClose: d,
                            closeAfterTransition: !0,
                            BackdropComponent: P.a,
                            BackdropProps: {timeout: 500},
                            children: Object(U.jsx)(R.a, {
                                in: n,
                                children: Object(U.jsxs)("div", {
                                    className: e.paper,
                                    children: [Object(U.jsx)("h2", {
                                        id: "transition-modal-title",
                                        children: "Registration"
                                    }), Object(U.jsx)(L, {closeModal: d})]
                                })
                            })
                        })]
                    })]
                })
            }
        }], Fe = r(42), Ie = r(383), Ue = r(63), Le = Object(Fe.a)(Ie.a)((function (e) {
            e.theme;
            return {
                boxShadow: "0px 0px 2px 0px #444444",
                textTransform: "none",
                fontSize: 16,
                color: "#fff",
                fontFamily: ["MuseoSansCyrl", "serif"].join(","),
                width: "100px",
                backgroundColor: Ue.a[700],
                "&:hover": {backgroundColor: Ue.a[500]}
            }
        })), we = r.p + "static/media/logo_VD-en.9f9cacfb.jpg", Ge = r(78);

        function Ve() {
            var e = Object(y.c)((function (e) {
                return e.user.isAuth
            })), t = Object(c.g)(), r = Object(y.b)();
            return Object(U.jsxs)("header", {
                className: "header",
                children: [Object(U.jsx)(Ge.b, {
                    to: "/",
                    children: Object(U.jsx)("img", {className: "logo", src: we, alt: "logoVolga-Dnepr"})
                }), Object(U.jsx)("nav", {
                    className: "navigation", children: Object(U.jsx)(I.a, {
                        justifyContent: "center",
                        alignItems: "center",
                        direction: {xs: "column", sm: "row"},
                        spacing: 2,
                        children: e ? Object(U.jsxs)(U.Fragment, {
                            children: [Object(U.jsx)(Le, {
                                onClick: function () {
                                    t.push("/messages")
                                }, children: "Messages"
                            }), Object(U.jsx)(Le, {
                                onClick: function () {
                                    return r(function (e) {
                                        return function () {
                                            var t = Object(m.a)(l.a.mark((function t(r) {
                                                var o;
                                                return l.a.wrap((function (t) {
                                                    for (; ;) switch (t.prev = t.next) {
                                                        case 0:
                                                            return t.prev = 0, t.next = 3, p.logout();
                                                        case 3:
                                                            o = t.sent, console.log("\u043e\u0442\u0432\u0435\u0442 \u043e\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u0430 \u043f\u0440\u0438 \u043d\u0430\u0436\u0430\u0442\u0438\u0438 \u043b\u043e\u0433\u0430\u0443\u0442", o), 200 === o.status && (console.log(o), r({type: O}), localStorage.removeItem("token"), e.replace("/")), t.next = 11;
                                                            break;
                                                        case 8:
                                                            t.prev = 8, t.t0 = t.catch(0), alert("\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0432\u044b\u0445\u043e\u0434\u0435 \u0438\u0437 \u0430\u043a\u043a\u0430\u0443\u043d\u0442\u0430", t.t0);
                                                        case 11:
                                                        case"end":
                                                            return t.stop()
                                                    }
                                                }), t, null, [[0, 8]])
                                            })));
                                            return function (e) {
                                                return t.apply(this, arguments)
                                            }
                                        }()
                                    }(t))
                                }, children: "Logout"
                            })]
                        }) : Object(U.jsx)(U.Fragment, {
                            children: Object(U.jsx)(Le, {
                                onClick: function () {
                                    t.push("/")
                                }, children: "Sign In"
                            })
                        })
                    })
                })]
            })
        }

        function ze() {
            var e = Object(y.c)((function (e) {
                return e.user
            })), t = Object(y.b)(), r = Object(c.g)();
            return Object(o.useEffect)((function () {
                localStorage.getItem("token") && t(function (e, t) {
                    return function () {
                        var r = Object(m.a)(l.a.mark((function r(o) {
                            var i;
                            return l.a.wrap((function (r) {
                                for (; ;) switch (r.prev = r.next) {
                                    case 0:
                                        return r.prev = 0, r.next = 3, p.refresh();
                                    case 3:
                                        200 === (i = r.sent).status && (localStorage.setItem("token", i.data.access_token), o(S()), t.push("".concat(e))), r.next = 11;
                                        break;
                                    case 7:
                                        r.prev = 7, r.t0 = r.catch(0), console.log(r.t0), t.push("/");
                                    case 11:
                                    case"end":
                                        return r.stop()
                                }
                            }), r, null, [[0, 7]])
                        })));
                        return function (e) {
                            return r.apply(this, arguments)
                        }
                    }()
                }(document.URL, r))
            }), []), Object(U.jsxs)(U.Fragment, {
                children: [Object(U.jsx)(Ve, {}), Object(U.jsxs)(c.d, {
                    children: [e.isAuth && _e.map((function (e) {
                        var t = e.path, r = e.Component;
                        return Object(U.jsx)(c.b, {path: t, component: r, exact: !0}, t)
                    })), ke.map((function (e) {
                        var t = e.path, r = e.Component;
                        return Object(U.jsx)(c.b, {path: t, component: r, exact: !0}, t)
                    })), Object(U.jsx)(c.a, {to: "/"})]
                })]
            })
        }

        var $e = r(66), Be = r(171), qe = r(172), Ze = {user: {curUser: null, isAuth: !1}, loader: !1},
            Ke = function () {
                var e = arguments.length > 0 && void 0 !== arguments[0] && arguments[0],
                    t = arguments.length > 1 ? arguments[1] : void 0;
                switch (t.type) {
                    case D:
                        return !0;
                    case v:
                        return !1;
                    default:
                        return e
                }
            }, He = function () {
                var e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : null,
                    t = arguments.length > 1 ? arguments[1] : void 0;
                switch (t.type) {
                    case g:
                        return Object(X.a)(Object(X.a)({}, e), {}, {curUser: t.payload});
                    case A:
                        return Object(X.a)(Object(X.a)({}, e), {}, {curUser: null});
                    case j:
                        return Object(X.a)(Object(X.a)({}, e), {}, {isAuth: !0});
                    case O:
                        return Object(X.a)(Object(X.a)({}, e), {}, {isAuth: !1, curUser: null});
                    default:
                        return e
                }
            }, Qe = Object($e.combineReducers)({user: He, loader: Ke}),
            Xe = Object($e.createStore)(Qe, Ze, Object(Be.composeWithDevTools)(Object($e.applyMiddleware)(qe.a)));
        n.a.render(Object(U.jsx)(i.a.StrictMode, {
            children: Object(U.jsx)(y.a, {
                store: Xe,
                children: Object(U.jsx)(Ge.a, {children: Object(U.jsx)(ze, {})})
            })
        }), document.getElementById("root"))
    }, 38: function (e, t, r) {
        e.exports = {
            validateMessage: "ValidateMessagesBlock_validateMessage__3E5Aa",
            validate: "ValidateMessagesBlock_validate__1HcsW",
            message: "ValidateMessagesBlock_message__1DwC1"
        }
    }, 7: function (e, t, r) {
        e.exports = {
            inputWrap: "fsu_inputWrap__1zmD7",
            inputWrapReceived: "fsu_inputWrapReceived__10pnl",
            formDiv: "fsu_formDiv__1rq2s",
            fsublock: "fsu_fsublock__6kbST",
            fsu: "fsu_fsu__1rzms",
            fsuh4: "fsu_fsuh4__2qeYG",
            fsublockmini: "fsu_fsublockmini__2Kkum",
            fsublockoption: "fsu_fsublockoption__3t4Jh",
            infoblock: "fsu_infoblock__3i0m4",
            infoblockDiv: "fsu_infoblockDiv__DbpZW",
            infoblockQuantity: "fsu_infoblockQuantity__LwZZZ",
            infoblockQuantityDetail: "fsu_infoblockQuantityDetail__-1v4L",
            awb: "fsu_awb__3WW0t",
            detailAndTotal: "fsu_detailAndTotal__MrB2C",
            detail: "fsu_detail__DaV9V",
            total: "fsu_total__1uE8C",
            MovementDetail: "fsu_MovementDetail__3kmrw",
            movement: "fsu_movement__NR7Ar",
            time: "fsu_time__2UyUl",
            message: "fsu_message__1rXxp",
            publish: "fsu_publish__1mGei",
            errorValidation: "fsu_errorValidation__sGT_J",
            "received-from-block": "fsu_received-from-block__mbznT",
            "received-from-input": "fsu_received-from-input__2vBiJ"
        }
    }
}, [[330, 1, 2]]]);
//# sourceMappingURL=main.f423e1be.chunk.js.map